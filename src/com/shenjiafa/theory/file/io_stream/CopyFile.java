package com.shenjiafa.theory.file.io_stream;

import java.io.*;

/**
 * Function: Copy file
 *
 * @author ShenJiaFa
 * @since 2022/4/28
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:\\MyCode\\resource\\file\\photo.jpg");
        OutputStream os = new FileOutputStream("C:\\MyCode\\resource\\file\\find\\photo.jpg");

        byte[] buffer = new byte[1024];

        int len;
        while ((len = is.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }

        System.out.println("复制完成!");
        is.close();
        os.close();
    }
}
