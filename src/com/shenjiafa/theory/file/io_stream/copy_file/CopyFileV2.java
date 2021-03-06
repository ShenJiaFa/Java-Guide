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
                InputStream is = new FileInputStream("C:\\MyCode\\resource\\file\\photo.jpg");
                OutputStream os = new FileOutputStream("C:\\MyCode\\resource\\file\\find\\photo.jpg");
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
