import java.io.File;

public class Test implements  Runnable{

    public static void deleteFile(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();

            }

            else if (file.isDirectory()) {
                deleteDirectory(file);

            }

        }

    }

    private static void deleteDirectory(File file) {
        File files[] = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                files[i].delete();

            }

            else if (files[i].isDirectory()) {
                deleteDirectory(files[i]);

            }

        }

        file.delete();

    }

    @Override
    public void run() {
        deleteFile(new File("D:\\数据恢复ios\\iMyfone_Full_Backup\\2022_09_28__15_18_50\\00008020-000854D026B8003A"));
    }
}