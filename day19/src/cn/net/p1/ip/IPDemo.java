package cn.net.p1.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {
    public static void main(String[] args) throws UnknownHostException {

        /**InetAddress:继承自Object，没有构造函数，无法创建对象
         *    有一个静态的方法，返回对象
         */

        //获取本地主机IP地址对象
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("ip = " + ip);

        //获取其他主机的IP地址
//        ip = InetAddress.getByName("DESKTOP-T7SBN45"); //通过主机名称获取IP对象
//        ip = InetAddress.getByName("192.168.0.110"); //通过IP地址来获取IP对象

        //获取主机地址 和主机名
        System.out.println(ip.getHostAddress()); //192.168.0.110
        System.out.println(ip.getHostName()); //DESKTOP-T7SBN45


  
    }
}
