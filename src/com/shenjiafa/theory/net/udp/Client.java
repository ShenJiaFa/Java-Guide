package com.shenjiafa.theory.net.udp;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * Function: Create client
 *
 * @author ShenJiaFa
 * @since 2022/5/22
 */
public class Client {
    public static void main(String[] args) throws IOException {

        System.out.println("Client start !");

        DatagramSocket socket=new DatagramSocket(6666);
        byte[] buffer ="My name is shen jia fa".getBytes();

        DatagramPacket pocket=new DatagramPacket(buffer,buffer.length,InetAddress.getLocalHost(),8888);
        socket.send(pocket);

        socket.close();
    }
}
