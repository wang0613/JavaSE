package cn.it.io.p9.encoding;

import java.io.UnsupportedEncodingException;

public class EncodeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /**
         * 文字在计算机里面是字符串————————> 字节数组：编码
         * 字符数组——————————————————>字符串： 解码
         *
         * 你好：-28-67-96-27-91-67 默认的utf-8 6个字节表示2个中文
         *      -60-29-70-61 GBK
         *
         *  如果你编码编错了，解码不出来
         *  如果编对了，解码错了，有可能有救
         *
         *  String str = "你好";
         *  byte[] bytes = str.getBytes("GBK");
         *  String s = new String("ios8859-1");
         *  输出错误，？？？
         *  重新编码
         *  byte [] bytes = s.getBytes("ios8859-1");
         *  String s = new String("GBK");
         */

        String str = "你好";

        //编码：
        byte[] buf = str.getBytes("GBK"); //默认码表utf-8

//        printBytes(buf);
        //解码：
        String strB = new String(buf, "GBK"); //利用GBK解读不会乱码

        System.out.println("strB = " + strB);//���默认utf-8解读 乱码

    }

    public static void printBytes(byte[] buf) {
        for (byte b : buf) {
            System.out.print(b);
        }


    }
}
