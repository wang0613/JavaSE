package cn.net.p4.chat;

import java.net.DatagramSocket;
import java.net.SocketException;

public class ChatDemo {
    public static void main(String[] args) throws SocketException {

        //创建资源
        DatagramSocket send = new DatagramSocket(); //发送端socket
        DatagramSocket receive = new DatagramSocket(10001); //接收端socket

        //创建任务
        Send s = new Send(send);
        Receive r = new Receive(receive);

        new Thread(s).start();
        new Thread(r).start();
        /**
         * 192.168.0.255 公共频段
         */
    }
}
