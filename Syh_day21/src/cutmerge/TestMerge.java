package cutmerge;

import java.io.*;

/*
    合并文件
 */
public class TestMerge {
    public static void main(String[] args) throws IOException {
        //创建输出流对象，绑定需要被合并成的文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\io\\merge\\合并.avi"));
        byte[] bs = new byte[1024];
        int len;

        for (int i = 1;i <= 28;i++) {
            //创建输入流对象，绑定当前的碎片文件
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\io\\cut\\" + i + ".avi"));
            while ((len = bis.read(bs)) != -1) {
                bos.write(bs, 0, len);
            }
            bis.close();
        }

        bos.close();
    }
}
