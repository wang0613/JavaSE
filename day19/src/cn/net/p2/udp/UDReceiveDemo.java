package cn.net.p2.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 接收端
 *   注意：要先启动接收端。
 */
public class UDReceiveDemo {
    public static void main(String[] args) throws IOException {

        System.out.println("接收端启动·········");
        /**
         *  建立udp接收端的思路
         *  1.建立socket服务，【因为是要接收数据，必须要明确端口号。】
         *  2.创建数据包，用于存储接收到的数据，方便用数据包对象的方法，解析这些数据
         *  3.使用socket服务的receive方法将接收到的数据，存储到数据包中
         *  4.通过数据包的方法 解析数据包中的数据
         *  5.关闭资源
         */

        //1。建立udp socket服务
        DatagramSocket ds = new DatagramSocket(10000); //绑定发送端 端口

        //2.创建数据包
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf,buf.length);

        //3.使用socket接收方法将数据存放在 数据包中
        ds.receive(dp); //阻塞式的，因为没有收到，要先启动接收端

        //4.使用数据包对象DatagramPackage 中的方法解析，比如地址，端口，数据内容
        //通过ip地址对象，获取ip地址字符串
        String ip = dp.getAddress().getHostAddress();

        //此端口不是本地的，是发送端的端口
        int port = dp.getPort(); //获取端口

        byte[] data = dp.getData(); //getData获取内容，转换为字符串
        String text = new String(data,data.length);

        System.out.println(ip+" :" +port +"  :" +text);

        //5.关闭资源
        ds.close();
    }

}
