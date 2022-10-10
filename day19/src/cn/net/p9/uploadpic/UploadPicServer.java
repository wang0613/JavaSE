package cn.net.p9.uploadpic;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 上传图片服务端
 */
public class UploadPicServer {
    public static void main(String[] args) throws IOException {

        //1.serverSocket
        ServerSocket ss = new ServerSocket(10006);
        while (true) {

            //2.获取客户端socket对象
            Socket s = ss.accept();

            //ip
            String ip = s.getInetAddress().getHostAddress();
            System.out.println("ip = " + ip + "已经连接···········");

            //利用多线程封装处理任务
            Thread t1 = new Thread(new UploadTask(s));
            t1.start();
        }



    }
}
