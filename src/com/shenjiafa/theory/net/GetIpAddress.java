package com.shenjiafa.theory.net;

import java.io.IOException;
import java.net.InetAddress;

/**
 * Function: Get ip address
 *
 * @author ShenJiaFa
 * @since 2022/5/22
 */
public class GetIpAddress {
    public static void main(String[] args) throws IOException {

        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());

        InetAddress baiduAddress1 = InetAddress.getByName("www.baidu.com");
        System.out.println(baiduAddress1.getHostName());
        System.out.println(baiduAddress1.getHostAddress());

        InetAddress baiduAddress2 = InetAddress.getByName("36.152.44.96");
        System.out.println(baiduAddress2.getHostName());
        System.out.println(baiduAddress2.getHostAddress());

        System.out.println(baiduAddress2.isReachable(3000));

    }
}
