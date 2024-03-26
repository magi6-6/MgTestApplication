package com.mg.socket.multiThread;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        InputStream is;
        try {
            is = socket.getInputStream();

            // 执行反序列化
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            System.out.println(br.readLine());

            // 向客户端写入信息
            OutputStream os = socket.getOutputStream();
            String str = "欢迎登陆到server服务器!";
            os.write(str.getBytes());

            // 关闭文件流
            os.close();
            is.close();
            socket.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
