package cn.net.p7.tcp.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 转换客户端
 */
public class ClientTrans {
    public static void main(String[] args) throws Exception {

        /**思路：
         * 客户端：
         *  1.需要现有socket端点
         *  2.客户端的数据源： 键盘
         *  3.客户端的目的：socket
         *  4.接收服务端的数据，源：socket
         *  5.将数据显示打印出来，目的：控制台
         *  6.在这些流中操作的数据，都是文本数据
         *
         * 转换客户端：
         * 1.创建socket客户端对象
         * 2.获取键盘录入
         * 3.将录入的信息发送给socket输出流
         */

        //1.创建socket客户端对象
        Socket s = new Socket("192.168.213.1", 10004);

        //2.获取键盘录入
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));


        // 将字输出字节流转换为 字符输出流+缓冲区 有点麻烦
//        new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        //3.目的是socket ,原样打印到服务端输出流
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);//原样打印

        //4.socket 输入流读取服务端返回的大写数据
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String line = null;
        while ((line = bufr.readLine()) != null) {
            if ("over".equals(line)) {
                break;
            }
            out.println(line);//打印给服务端

            //读取服务端发回的大写数据
            String upperStr = bufIn.readLine();
            System.out.println(upperStr);
        }
        s.close();

    }
}
