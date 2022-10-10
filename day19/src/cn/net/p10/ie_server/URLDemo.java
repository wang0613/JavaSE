package cn.net.p10.ie_server;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {
    //MalformedURLException 无法解析的异常
    public static void main(String[] args) throws IOException {

        String str_url = "http://192.168.0.110:9090/myweb/1.html?name = list";

        //封装统一资源定位符
        URL url = new URL(str_url);

        System.out.println(url.getProtocol()); //获取协议  http
        System.out.println(url.getHost()); //获取主机   192.168.0.110
        System.out.println(url.getPort()); //获取端口   9090
        System.out.println(url.getPath()); //获取路径  /myweb/1.html
        System.out.println(url.getFile()); //获取文件 /myweb/1.html?name = list

        //获取url对象的URL连接器对象，将连接封装为了对象
        //Java中内置可以解析的具体协议的对象+socket
        URLConnection con = url.openConnection();
        //sun.net.www.protocol.http.HttpURLConnection:http://192.168.0.110:9090/myweb/1.html?name = list
        System.out.println(con);

       /*
        InputStream in = url.openStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);

        String text = new String(buf, 0, len);
        System.out.println("text = " + text);

        in.close();*/

    }
}
