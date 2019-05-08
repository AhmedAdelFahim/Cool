
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CoolBaseVisitorLocal extends CoolBaseVisitor<String> {

    BufferedWriter writer;

    {
        try {
            writer = new BufferedWriter(new FileWriter("threeAddressCode.txt"));
        } catch (IOException e) {
            e.printStackTrace();
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
            writer.write(ctx.ID().getText() + " = " + visit(ctx.expr())+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
