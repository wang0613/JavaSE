package cn.net.p10.ie_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class MyBrowser {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("192.168.0.110", 8080);

        //模拟浏览器：给Tomcat服务器发送符合http协议的请求消息
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println("GET / HTTP/1.1 ");
        out.println("Accept-Encoding: gzip, deflate");
        out.println("Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6 ");
        out.println("Host: 192.168.0.110:8080  ");
        out.println("Connection: keep-alive ");
        out.println();
        out.println();

        InputStream in = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf, 0, len));

        s.close();

    }
}
