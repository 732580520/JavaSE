package objectstream;

import java.io.*;
import java.util.Arrays;

public class TestObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        test2();
    }

    public static void test2() throws IOException, ClassNotFoundException {
        //操作：将磁盘文件中的数据反序列到程序内部还原称为对象
        //创建对象输入流/反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"));
        /*
            运行时异常：
                java.io.InvalidClassException: com.bjpn.objectstream.Student
         */
        Student s = (Student) ois.readObject();
        int[] arr = (int[]) ois.readObject();
        System.out.println(s);
        System.out.println(Arrays.toString(arr));
    }

    public static void test1() throws IOException {
        Student s = new Student("李雷", 20, '男');
        int[] arr = {11, 22, 33, 44, 55, 66};

        //操作：内存中的对象序列化保存到磁盘文件中
        //创建对象输出流/序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
        /*
            运行时异常：
                java.io.NotSerializableException: com.bjpn.objectstream.Student

                理解：对应类型无法支持序列
                原因：Student类没有实现Serializable接口
         */
        oos.writeObject(s);
        oos.writeObject(arr);

        oos.close();
    }
}
