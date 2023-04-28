package copyfile;

import java.io.*;

/*
    需求：实现文件拷贝操作
 */
public class TestCopyFile {
    public static void main(String[] args) throws IOException {
//        copyFile();
//        copyFile2("d:\\io\\image\\3.avi", "d:\\io\\copy\\4.avi");
//        copyFile2("d:\\io\\image\\3.avi", "5.avi");

//        copyFile2("d:\\io\\image\\3.avi", "d:\\io\\copy\\6.avi");               //1878
//        copyFile3("d:\\io\\image\\3.avi", "d:\\io\\copy\\7.avi");      //511

    }

    //copy制定的文件
    public static void copyFile() throws IOException {
        //创建文件字节输入、输出流，分别绑定数据源和数据目的
        FileInputStream fis = new FileInputStream("d:\\io\\image\\1.jpg");
        FileOutputStream fos = new FileOutputStream("d:\\io\\copy\\2.jpg");

        byte[] bs = new byte[1024];
        int len;
        while ((len = fis.read(bs)) != -1) {
            fos.write(bs, 0, len);
        }

        //后开启的先关闭
        fos.close();
        fis.close();
    }

    //copy任意的文件
    public static void copyFile2(String src, String dest) throws IOException {
        long start = System.currentTimeMillis();
        //创建文件字节输入、输出流，分别绑定数据源和数据目的
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        byte[] bs = new byte[1024];
        int len;
        while ((len = fis.read(bs)) != -1) {
            fos.write(bs, 0, len);
        }

        //后开启的先关闭
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void copyFile3(String src, String dest) throws IOException {
        long start = System.currentTimeMillis();
        //创建节点流(文件字节输入、输出流)，分别绑定数据源和数据目的
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);
        //创建处理流(缓冲字节输入、输出流)，分别绑定节点流对象
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] bs = new byte[1024];
        int len;
        while ((len = bis.read(bs)) != -1) {
            bos.write(bs, 0, len);
        }

        //关闭处理流的过程中，会自动触发关闭所包含的节点流
        bos.close();
        bis.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void copyFile4(String src, String dest){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //创建节点流(文件字节输入、输出流)，分别绑定数据源和数据目的
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest);
            //创建处理流(缓冲字节输入、输出流)，分别绑定节点流对象
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] bs = new byte[1024];
            int len;
            while ((len = bis.read(bs)) != -1) {
                bos.write(bs, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭处理流的过程中，会自动触发关闭所包含的节点流
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
