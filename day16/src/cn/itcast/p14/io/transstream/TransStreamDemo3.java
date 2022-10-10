package cn.itcast.p14.io.transstream;
import java.io.*;

public class TransStreamDemo3 {

    public static void main(String[] args) throws IOException {

        /**
         * 转换流新演示
         */
//        writeText();
//        writeText_1();

//        readText();
        readText_1();

    }

    public static void readText_1() throws IOException {
        //使用指定的码表解码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk_1.txt"),"GBK");
        char [] c = new char[10];
        int len = isr.read(c);
        String str = new String(c,0,len);
        System.out.println("str = " + str);
    }

    public static void readText() throws IOException{

        //使用默认的码表解码
        FileReader fr  = new FileReader("gbk.txt");

        char [] c = new char[10];
        int len = fr.read(c); // 把文件读取到数组中
        String str = new String(c,0,len);
        System.out.println("str = " + str);

        fr.close();

    }

    public static void writeText_1() throws IOException {

        //使用GBK编码表，使用指定的编码表，有一个找不到编码表的异常
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk_1.txt"), "GBK");
        /**
         * 这两句话是相同的。
         * FileWriter：其实就是转换流指定了本机默认码表的体现，而且这个转换流的子类对象，可以方便操作文本文件。
         *
         * 简单说 ： 就是操作文件的字节流+本机默认的编码表
         *      这是按照默认码表操作文件的便捷类
         * 如果操作文本文件需要明确具体的编码，FileWriter就不行了，必须用转换流。
         */
        osw.write("大家好");
        osw.close();
    }

    public static void writeText() throws IOException {

        FileWriter fw = new FileWriter("gbk.txt"); //idea 默认utf-8

        fw.write("大家好"); //一个中文 占用两个以上字节
        fw.close();
    }
}
