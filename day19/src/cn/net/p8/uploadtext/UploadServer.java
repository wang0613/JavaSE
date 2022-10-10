package cn.net.p8.uploadtext;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
    public static void main(String[] args) throws IOException {

        //1.socket 服务
        ServerSocket ss = new ServerSocket(10005);
        //2.获取socket对象
        Socket s = ss.accept();

        //获取ip
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip);
        //3.获取客户端的东西
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //4.目的地：文件
        BufferedWriter bufw = new BufferedWriter(new FileWriter("server.txt"));

        //读取客户端，并写入到目的文件
        String line = null;
        while ((line = bufIn.readLine()) != null) {

            if ("over".equals(line)) {
                break;
            }
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }

        //5.返回给客户端信息
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println("上传成功！！");

        bufw.close();
        s.close();
        ss.close();

    }
}
