package cn.itcast.p9.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 缓冲区读取演示
 */
public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("buf.txt");

        //添加缓冲区演示
        BufferedReader br = new BufferedReader(fr);

//        String line1 = br.readLine();//读取一行，BufferReader 特有方法
//        System.out.println(line1);
//        String line2 = br.readLine();
//        System.out.println(line2);
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }

    //读取流演示 ：未添加缓冲区
    public static void show() throws IOException {
        FileReader fr = new FileReader("buf.txt");

        char [] buf = new char[1024];
        int len= 0;
        while ((len = fr.read(buf)) != -1) {
            System.out.println(new String(buf,0,len));
        }

        fr.close();
    }
}
