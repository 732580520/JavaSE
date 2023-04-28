package exer;

import java.io.*;

/*
    需求：实现某目录下所有文件的copy操作

    分析：
        1).判断目标目录是否存在，如果不存在就立即创建
        2).得到src资源下所有的内容(文件、目录) ==> File[] listFile()
        3).遍历File数组元素，判断是否文件 ==> boolean isFile()
        4).在遍历的过程中发现是文件，则将文件进行copy操作，copy后的文件的名字和源文件名字保持一致
           提示：获取源文件名字的方法 ==> String getName()
 */
public class Exer_1 {
    public static void main(String[] args) throws IOException {
        copyFile(new File("D:\\io\\image"), new File("D:\\io\\copy"));
    }

    public static void copyFile(File src,File dest) throws IOException {
        //判断目标目录dest是否真实存在
        if (!dest.isDirectory()) {
            //说明不存在，直接创建
            dest.mkdir();
        }

        //得到src资源下所有的内容(文件、目录)
        File[] files = src.listFiles();
        //遍历数组元素
        for (File file : files) {
            //判断是否是文件
            if (file.isFile()) {
                //说明是文件，进行复制操作
                String name = file.getName();
                String path = file.getAbsolutePath();
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(dest, name)));

                byte[] bs = new byte[1024];
                int len;
                while ((len = bis.read(bs)) != - 1) {
                    bos.write(bs, 0, len);
                }

                bos.close();
                bis.close();
            }
        }
    }
}
