package cn.net.p4.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive implements Runnable {

    private DatagramSocket ds;  //建立udp的socket服务

    public Receive(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            while (true) {

                byte[] buf = new byte[1024];
                //建立数据包
                DatagramPacket dp = new DatagramPacket(buf, 0, buf.length);

                ds.receive(dp);

                String ip = dp.getAddress().getHostAddress();//获取IP地址对象，来获取ip地址字符串

                byte[] bytes = dp.getData(); //获取数据
                String text = new String(bytes, 0, bytes.length);

                int port = dp.getPort();
                System.out.println(ip + " ::" + port + "::" + text);

                if (text.equals("886")) {
                    System.out.println(ip + "···退出聊天室！");
                }

            }
        } catch (IOException e) {

        }
    }
}
