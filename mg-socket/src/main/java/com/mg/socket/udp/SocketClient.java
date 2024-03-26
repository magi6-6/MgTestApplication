package com.mg.socket.udp;

import java.io.IOException;
import java.net.*;

public class SocketClient {
    public static void main(String[] args) {

        try {
            //定义要发送的消息
            String msg = "用户名：张三 密码:123";
            //获取服务器的地址
            InetAddress add = InetAddress.getByName("localhost");
            //创建packet包对象，封装要发送的包数据和服务器地址和端口号
            DatagramPacket packet = new DatagramPacket(msg.getBytes(),
                    msg.getBytes().length, add, 8888);
            //创建Socket对象
            DatagramSocket socket = new DatagramSocket();
            //发送消息到服务器
            socket.send(packet);
            //关闭socket
            socket.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
