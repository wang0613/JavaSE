package cn.net.p7.tcp.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTrans {
    public static void main(String[] args) throws IOException {

        /**
         * 转换服务端：
         *  1.serverSocket服务
         *  2.获取socket对象
         *  3.源：socket 读取客户端发过来的需要转换的数据 ss. inputstream
         *  4.目的：显示在控制台上
         *  5.将数据转换为大写发给客户端 outputstream
         */
        //1.获取服务端socket服务
        ServerSocket ss = new ServerSocket(10004);
        //2.获取socket对象
        Socket s = ss.accept();

        //获取ip
        String ip = s.getInetAddress().getHostAddress(); //返回IP地址对象的字符串形式
        System.out.println(ip + "····");

        //3.获取客户端发来的数据,并装饰
        BufferedReader bufIn =
                new BufferedReader(new InputStreamReader(s.getInputStream()));
        //4.获取socket输出流(返回客户端的数据)，并装饰
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        String line = null;
        while ((line = bufIn.readLine()) != null) {
            System.out.println(line);
            out.println(line.toUpperCase());
        }
        s.close();
        ss.close();

    }
}
