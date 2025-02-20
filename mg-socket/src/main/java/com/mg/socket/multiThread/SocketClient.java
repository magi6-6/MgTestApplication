package com.mg.socket.multiThread;

import java.io.*;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SocketClient {
    public static void main(String[] args) {

        try {
            /*
             * 1、创建socket，指定服务器的地址和端口号
             * 2、创建文件流
             * 3、执行读取或者写入操作
             * 4、关闭文件流
             * 5、关闭socket
             */
            System.out.println("客户端已启动!");
            Socket socket = new Socket("localhost", 8888);

            OutputStream os = socket.getOutputStream();
            String msg = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            os.write(msg.getBytes());
            // 写入对象
            // ObjectOutputStream oops = new ObjectOutputStream(os);
            // oops.writeObject(msg);


            socket.shutdownOutput();

            //获取服务器响应信息
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String info = null;
            while ((info = br.readLine()) != null) {
                System.out.println(info);
            }

            //关闭资源
            br.close();
            os.close();
            is.close();

            socket.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}