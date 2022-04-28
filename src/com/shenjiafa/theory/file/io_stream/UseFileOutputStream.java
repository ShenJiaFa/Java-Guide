package com.shenjiafa.theory.file.io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Function: Use FileOutputStream
 *
 * @author ShenJiaFa
 * @since 2022/4/27
 */
public class UseFileOutputStream {
    public static void main(String[] args) throws IOException {

        OutputStream outputStream1 = new FileOutputStream("C:\\MyCode\\resource\\file\\text4.txt",true);

        outputStream1.write('a');
        outputStream1.write(98);
        outputStream1.write("\r\n".getBytes());

        byte[] bytes1={'a',98,99,'d'};
        outputStream1.write(bytes1);
        outputStream1.write("\r\n".getBytes());

        byte[] bytes2="我爱你中国".getBytes();
        outputStream1.write(bytes2);
        outputStream1.write("\r\n".getBytes());

        outputStream1.write(bytes1,0,3);
        outputStream1.write("\r\n".getBytes());





        outputStream1.close();
    }
}
