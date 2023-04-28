package change;

import java.io.*;

/*

 */
public class TestInputStreamReader {
    public static void main(String[] args) throws IOException {
        test2();
    }

    public static void test2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\io\\change\\change.txt"), "gbk"));
        String line = br.readLine();
        System.out.println(line);
        br.close();

    }

    public static void test1() throws IOException {
        FileReader fr = new FileReader(new File("D:\\io\\change\\change.txt"));
        char[] cs = new char[10];
        int len;
        while ((len = fr.read(cs)) != -1) {
            System.out.println(new String(cs,0,len));
        }
        fr.close();
    }
}
