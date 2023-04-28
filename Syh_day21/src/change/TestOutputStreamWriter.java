package change;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestOutputStreamWriter {
    public static void main(String[] args) throws IOException {
        test2();
    }

    public static void test2() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("out6.txt"),"gbk");
        osw.write("今天要下雨！\r\n");
        osw.write("大家带伞了吗？\r\n");
        osw.close();
    }

    public static void test1() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("out5.txt"));
        osw.write("今天要下雨！\r\n");
        osw.write("大家带伞了吗？\r\n");
        osw.close();
    }
}
