package cn.it.io.p7.chararray;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayDemo {
    public static void main(String[] args) throws IOException {

        /**
         * 字符流缓冲区
         * int read()  读一个字符。
         * int read​(char[] b, int off, int len) 将字符读入数组的一部分。
         *
         * boolean ready()    判断此流是否可以读取。
         * void reset()       将流重置为最新标记，如果从未标记过，则重置为开头。
         * long skip(long n)  跳过字符。
         */
        CharArrayReader car = new CharArrayReader("ioio".toCharArray());

        CharArrayWriter caw = new CharArrayWriter();

        int ch = 0;
        while ((ch = car.read()) != -1) {
            caw.write(ch);

        }
        car.close();
        caw.close();
        System.out.println(caw.toCharArray());
    }
}
