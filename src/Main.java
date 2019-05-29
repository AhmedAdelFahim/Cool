import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int state = 0;
        String fileName,msg = "Press 1 to generate 3 Address Code\nPress 2 to generate Tokens\nPress 3 to check Files State\nPress 0 to exit";
        System.out.println(msg);
        while ((state = scanner.nextInt()) != 0) {
            if (state == 1) {
                System.out.println("Enter File Name: ");
                fileName = scanner.next();
                Generator.genThreeAddressCode(fileName);
            } else if (state == 2) {
                System.out.println("Enter File Name: ");
                fileName = scanner.next();
                Generator.genTokens(fileName);
            } else if (state == 3) {
                Generator.checkProgramState("./test");
            }
            System.out.println(msg);
        }
    }


}
