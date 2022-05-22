package com.shenjiafa.theory.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/5/22
 */
public class ServerPro {
    public static void main(String[] args) throws IOException {
        System.out.println("ServerPro start !");

        DatagramSocket socket = new DatagramSocket(8888);
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet=new DatagramPacket(buffer,buffer.length);

        while (true) {
            socket.receive(packet);
            int len= packet.getLength();
            String rs=new String(buffer,0,len);
            System.out.println("Received message:"+rs+"\n"+"IP Address:"+packet.getAddress()+"\n"+"Port:"+packet.getPort()+"\n---------------------------");
        }

    }
}
