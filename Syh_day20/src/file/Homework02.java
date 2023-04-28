package file;

import java.io.File;
import java.io.IOException;

/*
案例：
	1、检查D盘的testIO文件夹下是否存在文件a.txt，如果不存在则创建该文件。
	2、获取D盘的testIO文件夹下的a.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台
	3、判断File file = new File("d:\testIO");是否文件,是文件则输出：xxx是一个文件，是否文件夹,是文件夹则输出：xxx是一个文件夹
	4、删除D盘的testIO文件夹下的a.txt文件
	5、删除当前项目下的testIO文件夹下的1.txt文件，然后删除testIO文件夹
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
        //1
        File file1 = new File("D:\\testIO\\a.txt");
        if (!file1.exists()) {
            file1.createNewFile();
        }
        //2
        System.out.println(file1.getName());//a.txt                     文件名
        System.out.println(file1.length());//0                          文件大小
        System.out.println(file1.getAbsolutePath());//D:\testIO\a.txt   文件绝对路径
        System.out.println(file1.getParent());//D:\testIO               文件父路径

        //3
        File file2 = new File("D:\\testIo");
        if (file2.isFile()) {
            System.out.println(file2.getName() + "是一个文件");
        }
        if (file2.isDirectory()) {
            System.out.println(file2.getName() + "是一个文件夹");
        }

        //4
        file1.delete();

        //5
        File file3 = new File("testIO\\1.txt");
        file3.delete();
        File file4 = new File("testIO");
        file4.delete();
    }
}
