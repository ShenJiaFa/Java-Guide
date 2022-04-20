package com.shenjiafa.theory.file.create_file;

import java.io.File;

/**
 * Function: Use file
 *
 * @author ShenJiaFa
 * @since 2022/4/20
 */
public class UseFile {
    public static void main(String[] args) {

        File file = new File("C:\\MyCode\\resource\\file\\photo.jpg");

        // Get absolute path
        System.out.println(file.getAbsolutePath());

        // Get the path of the file definition
        System.out.println(file.getPath());

        // Get the name of file
        System.out.println(file.getName());

        // Get the size of the file (Unit: bytes)
        System.out.println(file.length());

        // Get the last modified time of file
        System.out.println(file.lastModified());
    }
}
