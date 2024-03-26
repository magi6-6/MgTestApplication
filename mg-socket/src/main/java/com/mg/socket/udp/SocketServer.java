package com.mg.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class SocketServer {
    public static void main(String[] args) {

        try {

            byte[] bytes = new byte[1024];
            //创建一个包对象
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
            //创建一个socket对象
            DatagramSocket socket = new DatagramSocket(8888);
            //接收消息
            socket.receive(packet);
            //将字节数组转换为字符串
            String msg = new String(packet.getData(), 0,
                    packet.getLength());
            //输出客户端的IP地址和消息
            System.out.println(packet.getAddress().getHostAddress() + ":" + msg);

            socket.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
