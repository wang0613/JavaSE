package cn.itcast.p14.io.transstream;

import java.io.IOException;
import java.io.InputStream;

/**
 * 读取一个键盘录入的数据，并打印在控制上
 * System 下：
 * static InputStream       in
 * “标准”输入流。
 * static PrintStream       out
 * “标准”输出流。
 */
public class ReadKey {
    public static void main(String[] args) throws IOException {

//        readKey();
//        System.out.println((int) '\r'); //13
//        System.out.println((int) '\n');//10

        readKey02();
    }

    public static void readKey02() throws IOException {
        /**
         * 获取用户键盘输入的数据
         * 并将数据变成大写显示在控制台上
         * 如果用户输入的是over 结束键盘输入
         *
         * 思路：
         *  1.因为键盘录入只读取一个字节，要判断是否是 over，要先将读取到的字节拼成字符串
         *  2.那就需要一个容器。 StringBuilder
         *  3.在用户回车之前将录入的数据变成字符串
         *
         */
        //1.创建容器
        StringBuilder sb = new StringBuilder();

        //2.获取键盘读取流
        InputStream in = System.in;

        //3.定义变量记录读取到的字节，并循环获取
        int ch = 0;
        while ((ch = in.read()) != -1) {
            //在存储之前，需要判断是否为换行标记
            if (ch == '\r')
                continue; //跳过
            //如果ch = '\n' 说明字符串结束
            if (ch == '\n') {
                String temp = sb.toString();
                if ("over".equals(temp))
                    break;

                System.out.println(temp.toUpperCase()); //转换为大写
                sb.delete(0, sb.length()); //清空集合 避免以前的数据全部添加到集合中,左闭右开
            } else {
                //将读取到的字节存储到StringBuilder中
                sb.append((char) ch);
                System.out.println(ch);
            }
        }
    }

    public static void readKey() throws IOException {

        InputStream in = System.in;

        int ch = in.read(); //阻塞式方法
        System.out.println(ch);

//        in.close(); 默认的输入设备和默认的输出设备不需要关闭流，只有一次

        InputStream in2 = System.in; //如果关闭流会报错
        int ch1 = in.read();
    }
}
