package cn.net.p5.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP服务端：
 */
public class TCPServerDemo {
    public static void main(String[] args) throws IOException {
        //服务端接收客户端发来的数据，并打印在控制台上

        /**
         * 建立tcp 服务端思路：
         * 1. 创建服务端socket服务，通过serverSocket对象
         * 2. 服务端必须对外提供一个端口，否则客户端无法连接
         * 3. 获取连接过来的客户端对象。 accept();
         * 4. 通过客户端对象，获取socket流读取客户端发来的数据
         *      并打印在控制台上
         * 5. 关闭资源。关客户端，关服务端；
         */

        // 1. 通过serverSocket对象,创建服务端socket服务，并制定端口
        ServerSocket ss = new ServerSocket(10002);

        //2.获取连接过来的客户端对象。
        Socket s = ss.accept();

        //拿ip地址
        String ip = s.getInetAddress().getHostAddress();

        //3.通过socket对象，获取输入流, 要读取客户端发来的数据
        InputStream in = s.getInputStream();

        byte[] buf = new byte[1024];
        int len = in.read(buf);
        String text = new String(buf, 0, len);
        System.out.println(ip + " ::" + text);

        s.close();
        ss.close();//服务端通常是不关闭的
    }
}
