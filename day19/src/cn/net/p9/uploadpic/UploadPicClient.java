package cn.net.p9.uploadpic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 上传图片客户端
 */
public class UploadPicClient {
    public static void main(String[] args) throws IOException {

        //1.socket
        Socket s = new Socket("192.168.0.110", 10006);

        //2.目的文件
        FileInputStream fis = new FileInputStream("0.jfif");

        //3.目的地 将读取到的文件发给客户端
        OutputStream out = s.getOutputStream();

        int len = 0;
        byte[] buf = new byte[1024];
        while ((len = fis.read(buf)) != -1) {

            out.write(buf, 0, len);//写出去
        }

        //告诉服务端，数据发送完毕
        s.shutdownOutput();

        //服务端的回应
        InputStream in = s.getInputStream();
        byte[] bufIn = new byte[1024];
        //读入到缓冲区

        int l = in.read(bufIn);
        String text = new String(bufIn, 0, l);
        System.out.println("text = " + text);

        s.close();
        fis.close();

    }
}
