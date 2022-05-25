package com.shenjiafa.theory.net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/5/25
 */
public class Server {
    public static void main(String[] args) {

        System.out.println("Server Start!");
        try {
            ServerSocket serverSocket = new ServerSocket(7777);
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String msg;
            if (null != (msg = br.readLine())) {
                System.out.println(socket.getRemoteSocketAddress() + ": " + msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
