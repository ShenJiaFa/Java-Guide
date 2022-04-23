package com.shenjiafa.practice.orient_process.find_file;

import java.io.File;

/**
 * Function: Search file in specified folder
 *
 * @author ShenJiaFa
 * @since 2022/4/22
 */
public class FindFile {
    public static void main(String[] args) {
        File file = new File("C:/MyCode");
        search(file, "find.txt");

    }

    /**
     * Search file in folder
     *
     * @param file     Specified folder
     * @param fileName File name
     */
    public static void search(File file, String fileName) {
        if (null != file && file.isDirectory()) {
            // Get all files in this folder
            File[] fileList = file.listFiles();
            if (null != fileList && fileList.length > 0) {
                // start iterate
                for (File f : fileList) {
                    if (f.isDirectory()) {
                        search(f, fileName);
                    } else {
                        if (f.getName().contains(fileName)) {
                            System.out.println(f.getAbsolutePath());
                        }
                    }
                }
            }
        } else {
            System.out.println("File input error");
        }
    }
}
