package com.intrbiz.snmp.mib.compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

import net.percederberg.mibble.Mib;
import net.percederberg.mibble.MibLoader;
import net.percederberg.mibble.browser.MibNode;
import net.percederberg.mibble.browser.MibTreeBuilder;

@SuppressWarnings("unchecked")
public class MIBCompiler
{
    private static Set<String> KEYWORDS = new HashSet<String>(Arrays.asList(new String[] {
            "char", "int", "long", "short", "byte", "double", "float", "boolean",
            "public", "private", "protected", "class", "static", "final", "abstract",
            "if", "new", "for", "else", "while", "break", "continue"
    }));
    
    public static void main(String[] args) throws Exception 
    {
        File      mibs = new File("./src/mib-compiler/mibs/");
        File iana_mibs = new File(mibs, "iana");
        File ietf_mibs = new File(mibs, "ietf");
        // setup the loader
        MibLoader loader = new MibLoader();
        loader.addDir(iana_mibs);
        loader.addDir(ietf_mibs);
        // compile the IANA mibs
        compilePackage(iana_mibs, loader, "iana");
        // compile the IETF mibs
        compilePackage(ietf_mibs, loader, "ietf");
    }
    
    private static void compilePackage(File dir, MibLoader loader, String pack) throws Exception
    {
        /*try (FileWriter idx = new FileWriter(new File(new File("./src/main/java/com/intrbiz/snmp/mib/defs"), pack.toUpperCase() + ".java")))
        {
            idx.write("package com.intrbiz.snmp.mib.defs;\n");
            idx.write("\n");
            idx.write("import com.intrbiz.snmp.mib.defs." + pack + ".*;\n");
            idx.write("\n");
            idx.write("/** All common " + pack + " MIBs, to be used as static imports /");
            idx.write("public final class " + pack.toUpperCase() + "\n");
            idx.write("{\n");*/
            // compile and index MIBs
            for (File aMib : dir.listFiles())
            {
                System.out.println("Compiling: " + aMib.getAbsolutePath());    
                Mib mib = loader.load(aMib);
                compileMIB(mib, pack, null /*idx*/);
            }
            //
            /*idx.write("}\n");
            idx.flush();
        }*/
    }
    
    private static void compileMIB(Mib mib, String subPackage, FileWriter idx) throws IOException
    {
        // build the tree
        MibTreeBuilder treeBuilder = MibTreeBuilder.getInstance();
        treeBuilder.unloadAllMibs();
        treeBuilder.addMib(mib);
        // compile the MIBs
        Enumeration<MibNode> children = ((MibNode) treeBuilder.getTree().getModel().getRoot()).children();
        while (children.hasMoreElements())
        {
            compileMIB(children.nextElement(), subPackage, idx, mib);
        }
    }
    
    public static void compileMIB(MibNode node, String subPackage, FileWriter idx, Mib mib) throws IOException
    {
        try (FileWriter fw = new FileWriter(new File(new File("./src/main/java/com/intrbiz/snmp/mib/defs/" + subPackage), cleanName(node.getName()) + "Def.java")))
        {
            Enumeration<MibNode> children;
            boolean ns;
            // index
            /*
            idx.write("    public static final " + ucfirst(cleanName(node.getName())) + "Def " + cleanName(node.getName()) + " = " + ucfirst(cleanName(node.getName())) + "Def." + cleanName(node.getName()) + ";\n");
            idx.write("\n");*/
            /*idx.write("    public static final " + ucfirst(cleanName(node.getName())) + "Def " + cleanName(node.getName()) + "() { return " + ucfirst(cleanName(node.getName())) + "Def." + cleanName(node.getName()) + "; }\n");
            idx.write("\n");*/
            //
            fw.write("package com.intrbiz.snmp.mib.defs." + subPackage + ";\n");
            fw.write("\n");
            fw.write("import com.intrbiz.snmp.mib.MIB;\n");
            fw.write("import com.intrbiz.snmp.mib.MIBs;\n");
            fw.write("\n");
            if (mib.getHeaderComment() != null) fw.write("/**" + mib.getHeaderComment() + "*/\n");
            fw.write("public final class " + ucfirst(cleanName(node.getName())) + "Def extends MIB\n");
            fw.write("{\n");
            fw.write("    public static final " + ucfirst(cleanName(node.getName())) + "Def " + cleanName(node.getName()) + " = new " + ucfirst(cleanName(node.getName())) + "Def();\n");
            fw.write("\n");
            fw.write("    static { MIBs.getInstance().registerMIB(" + ucfirst(cleanName(node.getName())) + "Def." + cleanName(node.getName()) + "); }\n");
            fw.write("\n");
            /*fw.write("    public static final " + ucfirst(cleanName(node.getName())) + "Def " + cleanName(node.getName()) + "() { return " + ucfirst(cleanName(node.getName())) + "Def." + cleanName(node.getName()) + "; }\n");
            fw.write("\n");*/
            // members
            children = ((MibNode) node.children().nextElement()).children();
            while (children.hasMoreElements())
            {
                MibNode child = children.nextElement();
                if (child.getSymbol().getComment() != null) fw.write("    /** " + child.getSymbol().getComment() + "*/\n");
                fw.write("    public final " + ucfirst(cleanName(child.getSymbol().getName())) + "Ent " + cleanName(child.getSymbol().getName()) + ";\n");
                fw.write("\n");
            }
            // constructor
            fw.write("    private " + ucfirst(cleanName(node.getName())) + "Def()\n");
            fw.write("    {\n");
            fw.write("        super(\"" + node.getName() + "\");\n");
            // init members
            children = ((MibNode) node.children().nextElement()).children();
            while (children.hasMoreElements())
            {
                MibNode child = children.nextElement();
                fw.write("        this." + cleanName(child.getSymbol().getName()) + " = new " + ucfirst(cleanName(child.getSymbol().getName())) + "Ent(this, null);\n");
            }
            // entries
            fw.write("        this.entries = new MIBEntry<?>[] {\n");
            children = ((MibNode) node.children().nextElement()).children();
            ns = false;
            while (children.hasMoreElements())
            {
                MibNode child = children.nextElement();
                if (ns) fw.write(",\n");
                fw.write("            this." + cleanName(child.getSymbol().getName()));
                ns = true;
            }
            fw.write("\n");
            fw.write("        };\n");
            // end contructor
            fw.write("    }\n");
            fw.write("\n");
            // members methods
            /*
            children = ((MibNode) node.children().nextElement()).children();
            while (children.hasMoreElements())
            {
                MibNode child = children.nextElement();
                fw.write("    public final " + ucfirst(cleanName(child.getSymbol().getName())) + "Ent " + cleanName(child.getSymbol().getName()) + "()\n");
                fw.write("    {\n");
                fw.write("        return this." + cleanName(child.getSymbol().getName()) + ";\n");
                fw.write("    }\n");
                fw.write("\n");
            }
            */
            // entry classes
            children = ((MibNode) node.children().nextElement()).children();
            while (children.hasMoreElements())
            {
                MibNode child = children.nextElement();
                printEntryClass(fw, "    ", ucfirst(cleanName(node.getName())) + "Def", child);
            }
            //
            fw.write("}\n");
            fw.flush();
        }
    }
    
    public static void printEntryClass(FileWriter fw, String padding, String mibClass, MibNode node) throws IOException
    {
        Enumeration<MibNode> children;
        boolean ns;
        //
        fw.write(padding + "public static final class " + ucfirst(cleanName(node.getSymbol().getName())) + "Ent extends MIBEntry<" + mibClass + ">\n");
        fw.write(padding + "{\n");
        // members
        children = node.children();
        while (children.hasMoreElements())
        {
            MibNode child = children.nextElement();
            if (child.getSymbol().getComment() != null) fw.write(padding + "    /** " + child.getSymbol().getComment() + "*/\n");
            fw.write(padding + "    public final " + ucfirst(cleanName(child.getSymbol().getName())) + "Ent " + cleanName(child.getSymbol().getName()) + ";\n");
            fw.write("\n");   
        }
        // constructor
        fw.write(padding + "    private " + ucfirst(cleanName(node.getSymbol().getName())) + "Ent(" + mibClass + " mib, MIBEntry<" + mibClass + "> parent)\n");
        fw.write(padding + "    {\n");
        fw.write(padding + "        super(mib, parent, \"" + node.getSymbol().getName() + "\", \"" + node.getOid() + "\", " + node.getSymbol().isScalar() + ", " + node.getSymbol().isTable() + ", " + node.getSymbol().isTableColumn() + ", " + node.getSymbol().isTableRow() + ");\n");
        // init members
        children = node.children();
        while (children.hasMoreElements())
        {
            MibNode child = children.nextElement();
            fw.write(padding + "        this." + cleanName(child.getSymbol().getName()) + " = new " + ucfirst(cleanName(child.getSymbol().getName())) + "Ent(mib, this);\n");
        }
        // entries
        fw.write(padding + "        this.entries = new MIBEntry<?>[] {\n");
        children = node.children();
        ns = false;
        while (children.hasMoreElements())
        {
            MibNode child = children.nextElement();
            if (ns) fw.write(",\n");
            fw.write(padding + "            this." + cleanName(child.getSymbol().getName()));
            ns = true;
        }
        fw.write("\n");
        fw.write(padding + "        };\n");
        // end constructor
        fw.write(padding + "    }\n");
        // members methods
        /*
        children = node.children();
        while (children.hasMoreElements())
        {
            MibNode child = children.nextElement();
            fw.write(padding + "    public final " + ucfirst(cleanName(child.getSymbol().getName())) + "Ent " + cleanName(child.getSymbol().getName()) + "()\n");
            fw.write(padding + "    {\n");
            fw.write(padding + "        return this." + cleanName(child.getSymbol().getName()) + ";\n");
            fw.write(padding + "    }\n");
            fw.write("\n");
        }
        */
        // child classes
        children = node.children();
        while (children.hasMoreElements())
        {
            MibNode child = children.nextElement();
            printEntryClass(fw, padding + "    ", mibClass, child);
        }
        // end class
        fw.write(padding + "}\n");
        fw.write("\n");
    }
    
    public static String cleanName(String name)
    {
        StringBuilder sb = new StringBuilder();
        for (char c : name.toCharArray())
        {
            if (('A' <= c && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '_')
            {
                sb.append(c);
            }
        }
        String cleaned = sb.toString();
        return KEYWORDS.contains(cleaned) ? (cleaned + "Entry") : cleaned;
    }
    
    public static String ucfirst(String s)
    {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
