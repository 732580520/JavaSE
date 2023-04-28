package homework;

import java.io.File;
import java.io.IOException;

public class HomeWork_5 {
    public static void main(String[] args) {
        test3();
    }

    public static void test3() {
        File f = new File("d:\\testIO\\a.txt");

        if (!f.exists()) {
            //说明不存在，则直接创建
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getParent());
        System.out.println(f.length());

        File f2 = new File(f.getParent());
        if (f2.isFile()) {
            System.out.println("testIO是文件");
        } else if (f2.isDirectory()) {
            System.out.println("testIO是目录");
        }

        if (f.exists()) {
            f.delete();
        }

        File f3 = new File("testIO/1.txt");
        f3.delete();

        File f4 = new File("testIO");
        f4.delete();
    }

    public static void test2() {
        File f1 = new File("testIO");
        boolean b = f1.mkdir();
        System.out.println(b);

        File f2 = new File(f1, "1.txt");
        try {
            boolean b2 = f2.createNewFile();
            System.out.println(b2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void test1() {
        File f1 = new File("d:\\testIO");
        boolean b = f1.mkdir();
        System.out.println(b);

        File f2 = new File(f1, "1.txt");
        try {
            boolean b2 = f2.createNewFile();
            System.out.println(b2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
