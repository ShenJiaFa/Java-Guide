package com.shenjiafa.theory.file.create_file;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * Function: Use file
 *
 * @author ShenJiaFa
 * @since 2022/4/20
 */
public class UseFile {
    public static void main(String[] args) {

        File file1 = new File("C:\\MyCode\\resource\\file\\photo.jpg");

        // Get absolute path
        System.out.println(file1.getAbsolutePath());

        // Get the path of the file definition
        System.out.println(file1.getPath());

        // Get the name of file
        System.out.println(file1.getName());

        // Get the size of the file (Unit: bytes)
        System.out.println(file1.length());

        // Get the last modified time of file
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file1.lastModified()));

        // Judge the file is a file or a folder
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());

        // Judge if the file exists
        System.out.println(file1.exists());

        System.out.println("---------------------------");

        // Get the filenames of all files in a folder
        File file2 = new File("C:/MyCode");
        String[] names = file2.list();
        for (String name : names) {
            System.out.println(name);
        }

        // Get all file objects in a folder
        File[] filenames = file2.listFiles();
        for (File file : filenames) {
            System.out.println(file.getAbsolutePath());
        }


    }
}
