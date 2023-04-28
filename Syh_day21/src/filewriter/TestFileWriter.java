package filewriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
    文件字符输出流：
 */
public class TestFileWriter {
    public static void main(String[] args) throws IOException {
        test2();
    }

    public static void test2() throws IOException {
        //创建文件字符输出流对象，绑定数据目的
        FileWriter fw = new FileWriter("out4.txt", true);
        Scanner input = new Scanner(System.in);
        for (int i = 1;i <= 3;i++) {
            System.out.println("请输入一串数据：");
            String content = input.next();
            fw.write(content + "\r\n");
            fw.flush();
        }
        fw.close();
    }

    public static void test1() throws IOException {
        //创建文件字符输出流对象，绑定数据目的
        FileWriter fw = new FileWriter("out3.txt");
        fw.write("自己好，");
        fw.write("不是真的好！");

//        fw.flush();
        fw.close();
    }
}
