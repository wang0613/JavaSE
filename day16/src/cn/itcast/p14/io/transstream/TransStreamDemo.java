package cn.itcast.p14.io.transstream;

import java.io.*;

/**
 * IO流 之间的转换：
 * Reader的子类：
 * InputStreamReader 是字节读取流通向字符流的桥梁,它使用指定的 charset(字符集) 读取字节并将其解码为字符
 * 称之为：转换流
 *
 * Writer的子类：
 * OutputStreamWriter 是字节输出流通向字符流的桥梁：可使用指定的 charset 将要写入流中的字符编码成字节。
 *
 */
public class TransStreamDemo {
    public static void main(String[] args) throws IOException {
//        inputStreamReaderShow();
        outputStreamWriterShow();

    }
    //字节流转换为字符流--->解码成字符
    public static void inputStreamReaderShow() throws IOException {
        /**
         * 键盘输入的简写：利用流的抓换
         */

        //字节流：读取中文读取两次，一次读取一个字节
        InputStream in = System.in; //键盘输入

        //将字节转换为字符流的转换流 InputStreamReader 转换流。
        InputStreamReader isr = new InputStreamReader(in); //把字节流扔进去，【解码】得到一个字符流
        //字符流 :中文只读取一次。
        BufferedReader br = new BufferedReader(isr); //字符流只能装饰字符流

        String line = null;
        while ((line = br.readLine()) != null) {

            if ("over".equals(line)) {
                break;
            }
            System.out.println(line.toUpperCase());
        }
        br.close();
    }

    //字符流转换为字节流  在控制台输出----> 将字符编码成字节
    public static void outputStreamWriterShow() throws IOException {
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);

        //打印语句就是一个标准的输出流
        OutputStream out = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(out);
        BufferedWriter bufw = new BufferedWriter(osw);

        String line = null;
        while ((line = br.readLine()) != null) {

            if ("over".equals(line)) {
                break;
            }
            bufw.write(line.toUpperCase());
            bufw.newLine();
            bufw.flush();
        }
    }

}
