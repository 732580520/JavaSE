package cutmerge;

import java.io.*;
/*
    切割文件
 */
public class TestCut {
    public static void main(String[] args) throws IOException {
        //创建输入流对象，关联绑定需要被切割文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\io\\image\\1_回顾.avi"));
        //2M大小切割
        byte[] bs = new byte[1024 * 1024 * 2];
        int len;
        int name = 1;       //用于给碎片文件起名字
        while ((len = bis.read(bs)) != -1) {
            //创建输出流对象，关联绑定当前的碎片文件
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\io\\cut\\" + name + ".avi"));
            bos.write(bs, 0, len);
            bos.close();
            name++;
        }

        bis.close();
    }
}
