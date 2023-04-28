package lambda;

import java.io.File;

public class FileFilter {
    public static void main(String[] args) {
        File file = new File("f:\\");
        File[] files = file.listFiles((pathname -> pathname.isFile() && pathname.getName().endsWith(".zip")));
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
