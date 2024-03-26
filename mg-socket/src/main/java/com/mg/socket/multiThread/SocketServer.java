package com.mg.socket.multiThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) {
        try {
            /*
             * 1、创建serverScoket对象 2、调用accept()方法开启监听 3、获取文件流（输出流或输入流） 4、执行读写操作
             * 5、关闭流 6、关闭serversocket。
             */
            ServerSocket server = new ServerSocket(8888);
            System.out.println("服务器已经启动！");
            // 接收客户端发送的信息
            while (true) {

                System.out.println("new server！");
                //阻塞会让程序停止
                Socket socket = server.accept();
                ServerThread st = new ServerThread(socket);
                st.start();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
