package com.shenjiafa.theory.file.io_stream.user_file_reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * Function: Use file reader v1
 *
 * @author ShenJiaFa
 * @since 2022/4/29
 */
public class UseFileReaderV1 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("C:\\MyCode\\resource\\file\\text3.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }

    }
}
