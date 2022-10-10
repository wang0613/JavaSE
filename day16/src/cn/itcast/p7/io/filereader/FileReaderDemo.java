package cn.itcast.p7.io.filereader;

import java.io.FileReader;
import java.io.IOException;

/**
 * 将硬盘中的文字输出到控制台
 */
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {

        //创建读取字符流的数据对象
        /**
         * 在创建读取流对象时，必须要明确被读取的文件，但是一定要确保该文件是存在的。
         *
         */
        FileReader fr = new FileReader("demo.txt");

        //用Reader中的 read读取字符，整数读取范围 0--65535之间，-1作为流的结束标记
//        int ch = fr.read();
//        System.out.println("ch = " + (char) ch); //a
//        int ch1 = fr.read();
//        System.out.println("ch1 = " + ch1); // 98
//        int ch2 = fr.read(); //只有两个字符，每次读取一个
//        System.out.println("ch2 = " + ch2); // -1

        int ch = 0;
        // 一次读取一个
        while ((ch =fr.read()) != -1){
            System.out.println((char) ch); //a b
        }

        fr.close(); //关闭流和资源
    }
}
