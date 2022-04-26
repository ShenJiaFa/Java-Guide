package com.shenjiafa.theory.file.charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Function: Use Charset
 *
 * @author ShenJiaFa
 * @since 2022/4/26
 */
public class UseCharset {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String name="我爱你中国abc";
        // Encode according to the system default charset (UTF-8)
        byte[] nameBytes1=name.getBytes();
        System.out.println(nameBytes1.length);
        System.out.println(Arrays.toString(nameBytes1));

        // Encode according to the GBK charset
        byte[] nameBytes2=name.getBytes("GBK");
        System.out.println(nameBytes2.length);
        System.out.println(Arrays.toString(nameBytes2));

        // Decode according to the system default charset (UTF-8)
        String nameDecode1=new String(nameBytes1);
        System.out.println(nameDecode1);

        // Decoding with an inappropriate charset will cause garbled characters
        String nameDecode2=new String(nameBytes2);
        System.out.println(nameDecode2);

        // Decoding according to the GBK charset
        String nameDecode3=new String(nameBytes2,"GBK");
        System.out.println(nameDecode3);

    }
}
