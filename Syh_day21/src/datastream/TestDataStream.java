package datastream;

import java.io.*;

/*
    数据流：
 */
public class TestDataStream {
    public static void main(String[] args) throws IOException {
        test2();
    }

    public static void test2() throws IOException {
        //将磁盘文件中的数据(基本类型、String类型)读入到程序内部
        DataInputStream dis = new DataInputStream(new FileInputStream("info.dat"));
        int i = dis.readInt();
        double d = dis.readDouble();
        char c = dis.readChar();
        boolean b = dis.readBoolean();
        String str = dis.readUTF();
        System.out.println(i);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(str);
    }

    public static void test1() throws IOException {
        int i = 100;
        double d = 3.14;
        boolean b = true;
        char c = 'a';
        String str = "hello";

        //将上述数据保存写入到磁盘文件中
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("info.dat"));
        dos.writeInt(i);
        dos.writeDouble(d);
        dos.writeChar(c);
        dos.writeBoolean(b);
        dos.writeUTF(str);

        dos.close();
    }
}
