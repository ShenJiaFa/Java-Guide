package com.shenjiafa.theory.file.io_stream.copy_file;

import java.io.*;

/**
 * Function: Copy file v1
 *
 * @author ShenJiaFa
 * @since 2022/4/28
 */
public class CopyFileV1 {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream("C:\\MyCode\\resource\\file\\photo.jpg");
            os = new FileOutputStream("C:\\MyCode\\resource\\file\\find\\photo.jpg");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                is.close();
            }
            if (os != null) {
                os.close();
            }
        }
    }
}
