package com.shenjiafa.theory.design_patterns.decorator;

/**
 * Function: Simulate BufferedInputStream
 *
 * @author ShenJiaFa
 * @since 2022/6/24
 */
public class BufferedInputStream extends InputStream {

    /**
     * Wrap fileInputStream
     */
    private FileInputStream fileInputStream;

    public BufferedInputStream(FileInputStream fileInputStream) {
        this.fileInputStream = fileInputStream;
    }

    @Override
    public int read() {
        System.out.println("Make functional enhancements !");
        return fileInputStream.read();
    }

    @Override
    public int read(byte[] buffer) {
        System.out.println("Make functional enhancements !");
        return fileInputStream.read(buffer);
    }
}
