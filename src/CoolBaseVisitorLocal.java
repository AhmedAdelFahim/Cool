
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
        protected SymbolTable outer;
        public SymbolTable(SymbolTable st) {
            table = new Hashtable();
            outer = st;
        }
        public void put(String token, String value) {
            table.put(token, value);
        }
        public boolean get(String value) {
            for (SymbolTable tab = this ; tab != null ; tab = tab.outer) {
                if(tab.table.containsValue(value)){
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
        public String toString() { return "t" + number; }
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
            SymbolTable.tableScope.peek().put("ID", ctx.ID(0).getText());
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
            writer.write(ctx.ID(0).getText()+":\n");
            writer.write("BeginFunc;\n");
            writer.write("Return " + visit(ctx.st()) + "\n");
            writer.write("EndFunc;\n");
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
}