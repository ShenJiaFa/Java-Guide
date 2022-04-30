package com.shenjiafa.theory.file.io_stream.buffer_stream;

import java.io.*;

/**
 * Function: Copy file by buffer stream
 *
 * @author ShenJiaFa
 * @since 2022/4/30
 */
public class CopyFileBuffer {
    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("C:\\MyCode\\resource\\file\\photo.jpg");
                InputStream bis=new BufferedInputStream(is);
                OutputStream os = new FileOutputStream("C:\\MyCode\\resource\\file\\find\\photo.jpg");
                OutputStream bos=new BufferedOutputStream(os);
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完成!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
