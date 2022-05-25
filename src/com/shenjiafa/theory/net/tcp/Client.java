package com.shenjiafa.theory.net.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * Function: Complete the introduction case of socket network programming,realize one send and one receive
 *
 * @author ShenJiaFa
 * @since 2022/5/25
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("Server Start!");
        try {
            Socket socket = new Socket("127.0.0.1", 7777);
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println("Hello! My name is Jim, what is your name?");
            ps.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
