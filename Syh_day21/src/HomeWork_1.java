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
public class HomeWork_1 {
    public static void main(String[] args) {
        copyFile(new File("F:\\毕设"), new File("F:\\copy"));
    }
    public static void copyFile(File src, File dest) {
        if (!dest.isDirectory()) {
         dest.mkdir();
        }
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                BufferedInputStream bis=null;
                BufferedOutputStream bos=null;
                try {
                     bis = new BufferedInputStream(new FileInputStream(file.getAbsolutePath()));
                     bos= new BufferedOutputStream(new FileOutputStream(new File(dest,file.getName())));
                     byte[] bs=new byte[1024];
                     int len;
                     while ((len=bis.read(bs))!=-1){
                         bos.write(bs,0,len);
                     }
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    try {
                        bos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
