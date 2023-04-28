package filereader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/*
    文件字符输入流：
 */
public class TestFileReader {
    public static void main(String[] args) throws IOException {
        test3();
    }

    public static void test3() throws IOException {
        //创建文件字符输入流对象，关联数据源
        FileReader fr = new FileReader("in.txt");
        char[] cs = new char[4];
        int len;        //记录读取到的有效字符数
        while ((len = fr.read(cs)) != -1) {
            System.out.println(new String(cs,0,len));
        }
        fr.close();
    }

    public static void test2() throws IOException {
        //创建文件字符输入流对象，关联数据源
        FileReader fr = new FileReader("in.txt");
        int num = fr.read();            //每次读取一个字符
        System.out.println(num);
        System.out.println((char) num);

        fr.close();
    }

    public static void test1() throws IOException {
        FileInputStream fis = new FileInputStream("in.txt");
//        int num = fis.read();         //每次读取一个字节
//        System.out.println(num);
//        System.out.println((char) num);

        byte[] bs = new byte[18];
        int len = fis.read(bs);
        System.out.println(new String(bs,0,len));

        fis.close();
    }
}
