package copyfile;

import java.io.*;

/*
    使用字符流处理字符文件的拷贝操作
 */
public class TestCopyFile2 {
    public static void main(String[] args) throws IOException {
//        copyFile("D:\\io\\image\\2.txt", "D:\\io\\copy\\2.txt");

        //字符流不能去处理字节文件的copy操作
//        copyFile("D:\\io\\image\\1.jpg", "D:\\io\\copy\\4.jpg");
    }

    public static void copyFile(String src,String dest) throws IOException {
        //创建缓冲字符输入、输出流对象，绑定节点流(数据源、数据目的)
        BufferedReader br = new BufferedReader(new FileReader(src));
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
