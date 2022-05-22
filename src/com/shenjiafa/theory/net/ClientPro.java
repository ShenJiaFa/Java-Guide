package com.shenjiafa.theory.net;

import java.io.IOException;
import java.net.*;
import java.util.Objects;
import java.util.Scanner;

/**
 * Function: Create ClientPro
 *
 * @author ShenJiaFa
 * @since 2022/5/22
 */
public class ClientPro {
    public static void main(String[] args) throws IOException {

        System.out.println("ClientPro start !");
        Scanner scanner=new Scanner(System.in);
        DatagramSocket socket=new DatagramSocket(6666);

        while (true) {
            System.out.println("Please enter the message you want to send:");
            String msg = scanner.nextLine();

            // Guard statement: block exit
            if(Objects.equals(msg,"exit")){
                System.out.println("exit the program!");
                socket.close();
                break;
            }

            byte[] buffer =msg.getBytes();
            DatagramPacket pocket=new DatagramPacket(buffer,buffer.length, InetAddress.getLocalHost(),8888);
            socket.send(pocket);
        }

    }
}
