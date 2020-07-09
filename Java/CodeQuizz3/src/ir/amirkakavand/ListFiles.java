package ir.amirkakavand;

import java.io.File;

public class ListFiles {

    public static void main(String[] args) {

        File dir = new File("C:\\");

        if (dir.isDirectory()) {
            File[] files = dir.listFiles();

            for (File f : files)
                if (((f.getName().length() == 7) || (f.getName().length() == 6) || (f.getName().length() == 5)) && getFileExtension(f).equals("pdf")) {
                    System.out.println(f.getName());
                }

        }
    }

    public static String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        else return "";
    }

}

