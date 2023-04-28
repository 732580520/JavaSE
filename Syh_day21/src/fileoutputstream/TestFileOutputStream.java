package fileoutputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    演示文件字节输出流的使用
 */
public class TestFileOutputStream {
    public static void main(String[] args) {
        try {
//            test1();
            test1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void test2() throws IOException {
        //创建文件字节输出流对象，关联File资源(定位文件位置)，并且开启追加模式
        FileOutputStream fos = new FileOutputStream(new File("out2.txt"), true);

        fos.write("发上等愿，结中等缘，享下等福。\r\n".getBytes());
        fos.write("择高处立，寻平处住，向宽处行。\r\n".getBytes());

        fos.close();
    }

    public static void test1() throws IOException {
        //创建文件字节输出流对象，关联File资源(定位文件位置)
        FileOutputStream fos = new FileOutputStream(new File("out1.txt"));
        //fos.write(97);
        fos.write(98);
        fos.write(99);

        fos.write("\r\nSH2303班所有学员好好学习，高薪就业！".getBytes());

        fos.close();
    }
}
