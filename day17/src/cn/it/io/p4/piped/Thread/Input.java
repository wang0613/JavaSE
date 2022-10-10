package cn.it.io.p4.piped.Thread;

import java.io.IOException;
import java.io.PipedInputStream;

public class Input implements Runnable {
    //输入流线程

    private PipedInputStream in;

    public Input(PipedInputStream in) {
        this.in = in;
    }

    @Override
    public void run() {

        try {
            byte[] buf = new byte[1024];
            int len = in.read(buf); //数据比较少，不循环了

            String s = new String(buf,0,len); // 转换为字符串
            System.out.println("s = " + s);
            in.close();
        } catch (IOException e) {

        }
    }

}
