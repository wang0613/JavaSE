package cn.net.p5.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * TCP 客户端：
 */
public class TCPClientDemo {
    public static void main(String[] args) throws IOException {
        //客户端发数据给服务端

        /**
         * TCP传输，客户端建立过程
         * 1.tcp客户端socket服务，使用的是socket对象
         *      建议该对象一创建就明确要连接的主机地址 和端口号
         * 2.如果连接建立成功，说明数据传输通道已经建立
         *      该通道就是socket流，socket是底层建立好的，说明这里既有输入又有输出。
         *      想要输入或者输出，可以找socket来获取
         * 可以通过 getInputStream();返回socket输入字节流
         *        getOutputStream(); 返回socket输出流
         * 3.根据需求：发送给服务端数据，或者读取服务端数据
         *  发送数据：使用输出流，将数据写出
         *
         *  4.关闭资源
         */

        //创建客户端socket服务
//        Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(),10002);
        //InetAddress.getLocalHost().getHostAddress()获取本机ip地址，写法都可以
        Socket socket = new Socket("192.168.0.110", 10002);

        //获取socket里面中的输出流
        OutputStream out = socket.getOutputStream();

        //使用输出流将指定的数据写出
        out.write(("tcp演示：客户端消息来了····").getBytes());

        //关闭资源
        socket.close(); //
        /**
         * 因为输出流 是socket里面的流，socket一旦关闭，输出流是不用关闭的
         */



    }
}
