package com.shenjiafa.theory.file.io_stream.copy_file;

import java.io.*;

/**
 * Function: Copy file v2
 *
 * @author ShenJiaFa
 * @since 2022/4/29
 */
public class CopyFileV2 {
    public static void main(String[] args) {
        try (
                InputStream is2 = new FileInputStream("C:\\MyCode\\resource\\file\\photo.jpg");
                OutputStream os2 = new FileOutputStream("C:\\MyCode\\resource\\file\\find\\photo.jpg");
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is2.read(buffer)) != -1) {
                os2.write(buffer, 0, len);
            }
            System.out.println("复制完成!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
