package com.shenjiafa.theory.file.io_stream;

import java.io.*;

/**
 * Function: Use FileInputStream
 *
 * @author ShenJiaFa
 * @since 2022/4/26
 */
public class UseFileInputStream {
    public static void main(String[] args) throws IOException {
        // Read file using byte
        InputStream inputStream1 = new FileInputStream("C:\\MyCode\\resource\\file\\text1.txt");
        int ch1 = inputStream1.read();
        System.out.println(ch1);
        System.out.println((char) ch1);
        int ch2 = inputStream1.read();
        System.out.println(ch2);
        System.out.println((char) ch2);
        int ch3 = inputStream1.read();
        System.out.println(ch3);
        System.out.println((char) ch3);
        int ch4 = inputStream1.read();
        System.out.println(ch4);

        System.out.println("---------------------------");

        // Read file using byte array
        InputStream inputStream2 = new FileInputStream("C:\\MyCode\\resource\\file\\text2.txt");
        byte[] bytes = new byte[3];
        int len1 = inputStream2.read(bytes);
        System.out.println(len1);
        String str = new String(bytes);
        System.out.println(str);

        int len2 = inputStream2.read(bytes);
        System.out.println(len2);
        String str2 = new String(bytes);
        System.out.println(str2);

        int len3 = inputStream2.read(bytes);
        System.out.println(len3);
        String str3 = new String(bytes, 0, len3);
        System.out.println(str3);

        int len4 = inputStream2.read(bytes);
        System.out.println(len4);
        String str4 = new String(bytes, 0, len3);
        System.out.println(str4);

        System.out.println("---------------------------");

        InputStream inputStream3 = new FileInputStream("C:\\MyCode\\resource\\file\\text3.txt");
        byte[] bytesAll = new byte[(int) new File("C:\\MyCode\\resource\\file\\text3.txt").length()];
        int len5 =inputStream3.read(bytesAll);
        String str5=new String(bytesAll);
        System.out.println(len5);
        System.out.println(str5);

    }
}
