package ua.java.dsa.algorithms.search;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ImageFileSearchInDirectory {
    public static void main(String[] args) {
        ArrayList<File> files = new ArrayList<>();
        searchImages(new File("/home/anton/Pictures"), files);

        files.forEach(System.out::println);
    }

    public static void searchImages(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchImages(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".png")) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}
