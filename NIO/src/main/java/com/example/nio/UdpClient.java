package com.example.nio;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {

    public static void main(String[] args) throws IOException {

        System.out.println("udp客户端启动连接....");
        DatagramSocket ds = new DatagramSocket();
        String str="蚂蚁课堂";
        byte[] bytes= str.getBytes();
        DatagramPacket dp= new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"),8080);
        ds.send(dp);
        ds.close();
    }

}
