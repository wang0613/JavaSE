package cn.itcast.p9.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 缓冲区写入演示
 */
public class BufferWriterDemo {

    private static final String LINE_SEPARATOR =System.getProperty("line.separator") ;

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("buf.txt");

        //为了提高写入的效率，使用了字符流的缓冲区、
        //创建了一个字符写入流的缓冲区对象，并和指定的被缓冲的流对象相关联。
        BufferedWriter bufw = new BufferedWriter(fw);

        //使用缓冲区的写入方法将数据先写入到缓冲区中。
//        bufw.write("abcdef"+LINE_SEPARATOR+"666");
//        bufw.write("abc");
//        bufw.newLine();   //换行符
//        bufw.write("666");

        for (int i = 0; i < 4; i++) {
            bufw.write("haha"+i);
            bufw.newLine();
            bufw.flush();
        }

        //使用缓冲区的刷新方法，将数据刷入目的地中
        bufw.flush();
        //关闭缓冲区，其实关闭的就是被缓冲的流对象
        bufw.close();

//        fw.write("hehe");//错误，因为关闭了缓冲区的同时也关闭了流
//        fw.close();


    }
}
