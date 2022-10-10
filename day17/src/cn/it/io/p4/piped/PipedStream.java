package cn.it.io.p4.piped;

import cn.it.io.p4.piped.Thread.Input;
import cn.it.io.p4.piped.Thread.Output;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 管道读取流只能读取管道输出流的数据
 */
public class PipedStream {
    public static void main(String[] args) throws IOException {

        PipedInputStream input  = new PipedInputStream();

        PipedOutputStream output  = new PipedOutputStream();
        //由两种方法连接管道
        //1.构造函数，连输出流
        //2.方法  void connect​(PipedOutputStream src)；

        input.connect(output);//连接到输出流

        //创建线程传入任务，并开启
        new Thread(new Input(input)).start();
        new Thread(new Output(output)).start();
    }
}
