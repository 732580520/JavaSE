package printstream;

import java.io.*;

/*
    打印流
 */
public class TestPrintStream {
    public static void main(String[] args) throws IOException {
        test4();
    }

    public static void test4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("out8.txt"), "gbk"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }


    public static void test3() throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream ps = new PrintStream("out8.txt", "gbk");
        ps.println("一阶段快要结束了!");
        ps.println("二阶段即将开始");
        ps.println("天下没有不散的筵席!");
        ps.println("情分依然在！");

        ps.close();
    }

    public static void test2() throws FileNotFoundException {
        PrintStream ps = new PrintStream(new File("out7.txt"));
        ps.println("打印流...");
        ps.println("还是打印流...");
        ps.println("继续是打印流...");

        ps.close();
    }

    public static void test1() {
        PrintStream out = System.out;
        out.println("控制台打印...");
    }
}
