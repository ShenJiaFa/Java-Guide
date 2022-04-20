package com.shenjiafa.theory.file.create_file;

import java.io.File;

/**
 * Function: Create file
 *
 * @author ShenJiaFa
 * @since 2022/4/17
 */
public class CreateFile {
    public static void main(String[] args) {

        // Create a file object
        File photoFile = new File("C:\\MyCode\\resource\\file\\photo.jpg");

        // Print file size in bytes
        System.out.println(photoFile.length());

    }
}
