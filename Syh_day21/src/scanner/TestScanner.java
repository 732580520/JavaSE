package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    Scanner流：
 */
public class TestScanner {
    public static void main(String[] args) throws FileNotFoundException {
        test2();
    }

    public static void test2() throws FileNotFoundException {
        Scanner input = new Scanner(new File("out8.txt"),"gbk");
        while (input.hasNextLine()) {
            String content = input.nextLine();
            System.out.println(content);
        }
        input.close();
    }

    public static void test1() throws FileNotFoundException {
        Scanner input = new Scanner(new File("out7.txt"));
        while (input.hasNextLine()) {
            String content = input.nextLine();
            System.out.println(content);
        }
        input.close();
    }
}
