package com.shenjiafa.theory.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Function: Create server
 *
 * @author ShenJiaFa
 * @since 2022/5/22
 */
public class Server {
    public static void main(String[] args) throws IOException {

        System.out.println("Server start !");

        DatagramSocket socket = new DatagramSocket(8888);
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet=new DatagramPacket(buffer,buffer.length);

        socket.receive(packet);
        int len= packet.getLength();

        String rs=new String(buffer,0,len);
        System.out.println("Received message:"+rs+" .");

        String clientIp=packet.getSocketAddress().toString();
        System.out.println("The Client's IP address is "+clientIp);

        int port= packet.getPort();
        System.out.println("The Client's IP port is "+port);

        socket.close();
    }
}
