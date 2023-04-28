package file;

import java.io.File;
import java.io.IOException;

/*
案例：
	1、使用绝对路径，在D盘下创建一个testIO文件夹，然后在testIO文件夹中创建一个1.txt文件
	2、使用相对路径，在当前项目下创建一个testIO文件夹，然后在testIO文件夹中创建一个1.txt文件
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {
        //1
        File file1 = new File("D:\\testIO");
        file1.mkdir();
        File file2 = new File("D:\\testIO\\1.txt");
        file2.createNewFile();

        //2
        File file3 = new File("testIO");
        file3.mkdir();
        File file4 = new File("testIO\\1.txt");
        file4.createNewFile();

    }
}
