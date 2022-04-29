package com.shenjiafa.theory.file.io_stream.user_file_reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * Function: Use file reader v2
 *
 * @author ShenJiaFa
 * @since 2022/4/29
 */
public class UseFileReaderV2 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("C:\\MyCode\\resource\\file\\text3.txt");
        char[] buffer = new char[1024];
        int len;
        while((len=fr.read(buffer))!=-1){
            String str = new String(buffer,0,len);
            System.out.println(str);
        }

    }
}
