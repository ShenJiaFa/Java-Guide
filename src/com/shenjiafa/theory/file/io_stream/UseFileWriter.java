package com.shenjiafa.theory.file.io_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/4/29
 */
public class UseFileWriter {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("C:\\MyCode\\resource\\file\\text5.txt");
        writer.write(97);
        writer.write('a');
        writer.write('东');
        writer.write("abc我是中国人");
        writer.write("abc我是中国人".toCharArray());
        writer.write("abc我是中国人",0,5);
        writer.write("abc我是中国人".toCharArray(),3,5);
        writer.close();
    }
}
