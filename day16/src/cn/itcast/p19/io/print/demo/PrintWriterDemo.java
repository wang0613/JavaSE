package cn.itcast.p19.io.print.demo;

import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {

        /**
         * 【重点】：保证数据的原样性
         * PrintWriter: 字符打印流
         * 构造函数，接收四种数据类型的值
         *        1.字符串路径
         *        2.File对象
         *        3.字节输出流   boolean autoFlush,true为自动刷新
         *        4.字符输出流                    ,true为自动刷新
         */

        //字节转换流  ———————— 》 字符
        BufferedReader bufw = new BufferedReader(new InputStreamReader(System.in));

        //字符输出流到 目的文件
        PrintWriter out = new PrintWriter(new FileWriter("out.txt"),true);

        String line = null;
        while ((line = bufw.readLine()) != null) {

            //强制结束，打印不出
            if ("over".equals(line)) {
                break;
            }
            out.println(line.toUpperCase()); //大写打印,并换行 println换行打印
//            out.flush();//刷新一次缓冲器，不刷新全部到了缓冲区
        }

        out.close();
        bufw.close();


    }
}
