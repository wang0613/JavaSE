package cn.net.p4.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send implements Runnable {

    private DatagramSocket ds;  //建立udp的socket服务

    public Send(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
            String line = null;

            while ((line = bufr.readLine()) != null) {

                byte[] buf = line.getBytes();
                //将数据包的指定长度，发送的IP地址对象的指定端口
                DatagramPacket dp = new DatagramPacket
                        (buf,buf.length, InetAddress.getLocalHost(),10001);

                ds.send(dp);//发送
                //如果输入的是over 挂断
                if ("over".equals(line)) {
                    break;
                }
            }
            ds.close(); //关闭服务
        } catch (IOException e) {

        }
    }
}
