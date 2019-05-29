
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Hashtable;
import java.util.Stack;

public class CoolBaseVisitorLocal extends CoolBaseVisitor<String> {

    BufferedWriter writer;
    {
        try {
            writer = new BufferedWriter(new FileWriter("threeAddressCode.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class SymbolTable {
        private Hashtable table;
        public static Stack<SymbolTable> tableScope = new Stack<>();
        private SymbolTable outer;
        public SymbolTable(SymbolTable st) {
            this.table = new Hashtable();
            this.outer = st;
        }
        public void put(String token, String value) {
            table.put(token, value);
        }
        public boolean get(String value) {
            int i=0;
            for (SymbolTable tab = SymbolTable.tableScope.peek(); tab != null ; tab = tab.outer) {
//                System.out.println("scope" + i++ + '\n' +tab.table.toString());
                if(tab.table.containsKey(value)){
                    return true;
                }
            }
            return false;
        }
    }

    static public class Temp{
        static int count = 0;
        int number;
        public Temp() { number = ++count; }
        public String toString() { return "t" + this.number; }
    }
    static public class Label{
        static int count = 0;
        int number;
        public Label() { number = ++count; }
        public String toString() { return "l" + this.number ; }
    }

    @Override
    public String visitAdd(CoolParser.AddContext ctx) {
        Temp t = new Temp();
        try {
            writer.write(t.toString() + " = " + visit(ctx.expr(0)) + " + " + visit(ctx.expr(1))+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t.toString();
    }

    @Override
    public String visitSub(CoolParser.SubContext ctx) {
        Temp t = new Temp();
        try {
            writer.write(t.toString() + " = " + visit(ctx.expr(0)) + " - " + visit(ctx.expr(1))+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t.toString();
    }

    @Override
    public String visitMul(CoolParser.MulContext ctx) {
        Temp t = new Temp();
        try {
            writer.write(t.toString() + " = " + visit(ctx.expr(0)) + " * " + visit(ctx.expr(1))+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t.toString();
    }

    @Override
    public String visitDiv(CoolParser.DivContext ctx) {
        Temp t = new Temp();
        try {
            writer.write(t.toString() + " = " + visit(ctx.expr(0)) + " / " + visit(ctx.expr(1))+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t.toString();
    }

    @Override
    public String visitInteger(CoolParser.IntegerContext ctx) {

        return ctx.INTEGER().toString();
    }

    @Override public String visitParantesies(CoolParser.ParantesiesContext ctx) {
//        visit(ctx.expr());
        return visit(ctx.expr());
    }

    @Override
    public String visitIdentifier(CoolParser.IdentifierContext ctx) {
        if (!SymbolTable.tableScope.peek().get(ctx.ID().getText())){
            System.err.println("undeclared variable at ^" + ctx.ID().getText());
        }
        return ctx.ID().getText();
    }

    @Override
    public String visitAssignment(CoolParser.AssignmentContext ctx) {
        try {
            if (!SymbolTable.tableScope.peek().get(ctx.ID().getText())){
                System.err.println("undeclared variable at ^" + ctx.ID().getText());
            }
            writer.write(ctx.ID().getText() + " = " + visit(ctx.expr())+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ctx.ID().getText();
    }

    @Override
    public String visitBlock(CoolParser.BlockContext ctx) {
        if (SymbolTable.tableScope.empty()){
            SymbolTable.tableScope.push(new SymbolTable(null));
        }else {
            SymbolTable.tableScope.push(new SymbolTable(SymbolTable.tableScope.peek()));
        }
        String data="";
        for (int i=0; i<(ctx.getChildCount()-2)/2; i++){
            data = visit(ctx.st(i));
        }
        SymbolTable.tableScope.pop();
        return data;
    }

    @Override
    public String visitCls(CoolParser.ClsContext ctx) {
        if (SymbolTable.tableScope.empty()){
            SymbolTable.tableScope.push(new SymbolTable(null));
        }else {
            SymbolTable.tableScope.push(new SymbolTable(SymbolTable.tableScope.peek()));
        }

        visitChildren(ctx);
        SymbolTable.tableScope.pop();
        return "";
    }

    @Override
    public String visitVarialeDeclare(CoolParser.VarialeDeclareContext ctx) {
        if (SymbolTable.tableScope.peek().table.containsValue(ctx.ID(0).getText())){
            System.err.println("dublicate of declaration at ^" + ctx.ID(0).getText());
            return "";
        }else{
//            System.out.println("varaible declared" + ctx.ID(0).getText());
            SymbolTable.tableScope.peek().put(ctx.ID(0).getText(), "ID");
            try {
                if (ctx.getChildCount()>3){
                    writer.write(ctx.ID(0).getText() + " = " + visit(ctx.expr())+"\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return "";
        }
    }

    @Override
    public String visitString(CoolParser.StringContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFunctionDeclare(CoolParser.FunctionDeclareContext ctx) {
        try {

            if (SymbolTable.tableScope.empty()){
                SymbolTable.tableScope.push(new SymbolTable(null));
            }else {
                SymbolTable.tableScope.push(new SymbolTable(SymbolTable.tableScope.peek()));
            }

            if (ctx.getChildCount()>8) {
                SymbolTable.tableScope.peek().put(ctx.param(0).ID(0).getText(), "ID");
                for (int i = 0; i < (ctx.getChildCount() - 9) / 2; i++) {
                    SymbolTable.tableScope.peek().put(ctx.param(i).ID(0).getText(), "ID");
                }
            }

            writer.write(ctx.ID(0).getText()+":\n");
            writer.write("BeginFunc;\n");
            writer.write("Return " + visit(ctx.st()) + "\n");
            writer.write("EndFunc;\n");

            SymbolTable.tableScope.pop();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    @Override
    public String visitCallFunction(CoolParser.CallFunctionContext ctx) {
        Temp t = new Temp();
        try {
            int cnt = 0;
            if (ctx.getChildCount()>3) {
                cnt++;
                writer.write("PushParam " + visit(ctx.expr(0)) + "\n");
                for (int i = 0; i < (ctx.getChildCount() - 4) / 2; i++) {
                    cnt++;
                    writer.write("PushParam " + visit(ctx.expr(i + 1)) + "\n");
                }
            }
            writer.write(t.toString() + " = LCall " + ctx.ID().getText() + "\n");
            writer.write("PopParams " + cnt*4 + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t.toString();
    }

    @Override
    public String visitNot(CoolParser.NotContext ctx) {
        Temp t = new Temp();
        try {
            writer.write(t.toString() + " = " + " ! "+visit(ctx.expr()) +"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t.toString();
    }

    @Override
    public String visitLessThan(CoolParser.LessThanContext ctx) {
        Temp t = new Temp();
        try {
            writer.write(t.toString() + " = " +visit(ctx.expr(0)) + " < "+visit(ctx.expr(1)) +"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t.toString();
    }

    @Override
    public String visitLessThanOrEqual(CoolParser.LessThanOrEqualContext ctx) {
        Temp t = new Temp();
        try {
            writer.write(t.toString() + " = " +visit(ctx.expr(0)) + " <= "+visit(ctx.expr(1)) +"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t.toString();
    }

    @Override
    public String visitEquals(CoolParser.EqualsContext ctx) {
        Temp t = new Temp();
        try {
            writer.write(t.toString() + " = " +visit(ctx.expr(0)) + " == "+visit(ctx.expr(1)) +"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t.toString();
    }

    @Override
    public String visitTrue(CoolParser.TrueContext ctx) {
        Temp t = new Temp();
        try {
            writer.write(t.toString() + " = TRUE" +"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t.toString();
    }

    @Override
    public String visitFalse(CoolParser.FalseContext ctx) {
        Temp t = new Temp();
        try {
            writer.write(t.toString() + " = FALSE" +"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t.toString();
    }

    @Override
    public String visitIf(CoolParser.IfContext ctx) {

        Label labelTrue = new Label();
        Label next = new Label();
        try {
            writer.write("ifTrue " + visit(ctx.expr()) +" goto "+labelTrue.toString() + "\n");
            visit(ctx.st(1));
            writer.write("goto "+next.toString() + "\n");
            writer.write(labelTrue.toString() + " : "+ "\n");
            visit(ctx.st(0));
            writer.write(next.toString() +" : "+ "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public String visitWhile(CoolParser.WhileContext ctx) {
        Label W = new Label();
        Label next = new Label();
        try {
            writer.write(W.toString() +" : "+ "\n");
            writer.write("ifFalse " + visit(ctx.expr()) +" goto "+next.toString() + "\n");
            visit(ctx.st());
            writer.write("goto "+W.toString() + "\n");
            writer.write(next.toString() +" : "+ "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

}
