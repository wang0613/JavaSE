package cn.net.p8.uploadtext;

import java.io.*;
import java.net.Socket;

public class UploadClient {
    public static void main(String[] args) throws IOException {

        //1.socket 服务
        Socket s = new Socket("192.168.0.110", 10005);

        //2.读取文件
        BufferedReader bufr = new BufferedReader(new FileReader("client.txt"));

        //3.目的地
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        //读取 写出
        String line = null;
        while ((line = bufr.readLine()) != null) {

            out.println(line);
        }
        out.println("over!");

        //4读取服务端返回的
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String str = bufIn.readLine();
        System.out.println("str = " + str);

        bufr.close();
        s.close();
    }
}
