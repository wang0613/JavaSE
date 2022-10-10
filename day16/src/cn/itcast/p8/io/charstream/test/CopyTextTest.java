package cn.itcast.p8.io.charstream.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest {
    public static void main(String[] args) throws IOException {
        /**
         * 作业 ：将C盘 中的一个文件复制到 D盘
         * 复制原理：连读带写
         * 分析： 读取C盘中的文件
         *      讲这些写入d盘中  操作文本数据--》字符流
         */
        //1. 读取一个已有的文本文件，使用字符读取流和文件关联
        FileReader fr = new FileReader("demo.txt");
        //2.创建一个目的，用于存储数据
        FileWriter fw = new FileWriter("copytext_1.txt");

        //3.频繁的读写操作
        int ch = 0;
        //一次读取一个
        while((ch= fr.read()) != -1) {
            fw.write(ch); //将读取到的字符 写入    目的地
        }

        //4.关闭流
        fw.close(); //流就是把硬盘上的东西放到内存上，不关就会浪费资源
        fr.close(); //先打开 后关闭

    }
}
