package cn.itcast.p19.io.print.demo;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        /**
         * PrintStream:
         *  1.提供了打印的方法，可以对多种数据类型进行打印，并保持了数据的表示形式
         *  2.永远不抛出IO异常
         *
         *  构造函数，接收三种数据类型的值
         *  1.字符串路径
         *  2.File对象
         *  3.字节输出流
         */
        PrintStream out = new PrintStream("print.txt");

//        out.write(97); //只写最低八位

        out.print(97);//转换为字符串保持原样将字符串打印到目的地，String.valueOf(i);

        out.close();



    }
}
