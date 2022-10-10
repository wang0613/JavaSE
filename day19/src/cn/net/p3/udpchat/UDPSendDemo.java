package cn.net.p3.udpchat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

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
        DatagramSocket ds = new DatagramSocket();

        //从键盘输入
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = bufr.readLine()) != null) {

            byte[] buf = line.getBytes();
            DatagramPacket dp =
                    new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 10000);

            ds.send(dp);

            if ("over".equals(line)) {
                break;
            }
        }


        ds.close();

    }
}
