package cn.net.p2.udp;

import java.io.IOException;
import java.net.*;

public class UDPSendDemo {
    public static void main(String[] args) throws IOException {

        System.out.println("发送端启动·········");
        /**
         *
         * 创建UDP传输的发送端
         * 思路：
         *  1.建立UDP的Socket服务。
         *  2.将要发送的数据封装到数据包中
         *  3.通过UDP的Socket服务将数据包发送出去
         *  4.关闭Socket服务
         */

        //1.udp的socket服务，使用DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();

        //2.将要发送的数据封装到数据包中
        String str = "udp 数据来了'''''";
        //使用DatagramPacket将数据封装到该对象中
        byte[] buf = str.getBytes();

        /*DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。*/
        DatagramPacket dp =
         new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.0.110"), 10000);

        //3通过udp 的socket服务将数据包发送出去，使用send方法
        ds.send(dp);

        //4.关闭资源
        ds.close();

    }
}
