package cn.net.p9.uploadpic;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class UploadTask implements Runnable {

    private Socket s;

    public UploadTask(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {

        try {
            //3.读取客户端发来的数据
            InputStream in = s.getInputStream();
            //4.创建目的文件
            FileOutputStream fos = new FileOutputStream("6.jfif");

            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = in.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }

            //给客户端发一个上传成功
            OutputStream out = s.getOutputStream();
            out.write("上传成功".getBytes());

            fos.close();
            s.close();

        } catch (Exception e) {

        }
    }
}
