import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class Generator {
    private static ErrorReport errorListener = new ErrorReport();
    public static void genThreeAddressCode(String fileName) throws IOException {
        InputStream is;
        is = new FileInputStream(fileName);
        ANTLRInputStream input = new ANTLRInputStream(is);
        CoolLexer lexer = new CoolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CoolParser parser = new CoolParser(tokens);
        ParseTree tree = parser.program(); // parse; start at prog
        CoolBaseVisitorLocal local = new CoolBaseVisitorLocal();
        local.visit(tree);
        local.writer.close();
    }

    public static void genTokens(String fileName) throws IOException {
        InputStream is;
        is = new FileInputStream(fileName);
        ANTLRInputStream input = new ANTLRInputStream(is);
        CoolLexer lexer = new CoolLexer(input);
        lexer.removeErrorListeners();
        lexer.removeErrorListeners();
        lexer.addErrorListener( errorListener );
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CoolParser parser = new CoolParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener( errorListener );
        ParseTree tree = parser.program(); // parse; start at prog
        BufferedWriter writer = new BufferedWriter(new FileWriter("out-token.txt"));
        for(int i = 0; i<tokens.getTokens().size()-1;i++)
        {
            String tokenName = CoolLexer.ruleNames[tokens.get(i).getType()-1];

            if( tokenName.equals("ID") || tokenName.equals("STRING") || tokenName.equals("INTEGER"))
                writer.write("Line "+tokens.getTokens().get(i).getLine()+": < "+tokenName+" , "+tokens.get(i).getText()+" >\n");
            else if(tokens.get(i).getType() > tokens.size()){
                System.err.println("ERROR "+tokens.getTokens().get(i).getLine()+": unexpected token at "+tokens.get(i).getText()+"\n");
                writer.write("ERROR "+tokens.getTokens().get(i).getLine()+": unexpected token at "+tokens.get(i).getText()+"\n");
            }
            else
                writer.write("Line "+tokens.getTokens().get(i).getLine()+": < "+tokenName+" >\n");
        }
        writer.close();
    }


    public static void checkProgramState(String dir) throws IOException {
        File file = new File(dir);
        File[] directoryListing = file.listFiles();
        if (directoryListing != null) {
            for (File child : directoryListing) {
                InputStream is = System.in;
                is = new FileInputStream(child);
                ANTLRInputStream input = new ANTLRInputStream(is);
                CoolLexer lexer = new CoolLexer(input);
                lexer.removeErrorListeners();
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CoolParser parser = new CoolParser(tokens);
                parser.getNumberOfSyntaxErrors();
                parser.removeErrorListeners();
                parser.addErrorListener( errorListener );
                boolean error = parser.getNumberOfSyntaxErrors() > 0;
                for(int i = 0; i<tokens.getTokens().size()-1;i++)
                {
                    String tokenName = CoolLexer.ruleNames[tokens.get(i).getType()-1];
                    if(tokenName.equals("ERRORCHARACTER"))
                        error = true;
                }

                if(error)
                {
                    System.out.println(child.getName() +" --> Bad");
                }
                else
                {
                    System.out.println(child.getName() +" --> Good");
                }
            }
        }

    }
}
