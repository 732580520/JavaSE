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
        deleteFile(new File("D:\\需要上传\\20230303桌面\\零基础学习ssm"));
    }
}