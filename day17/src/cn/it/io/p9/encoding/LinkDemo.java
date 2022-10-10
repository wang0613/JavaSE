package cn.it.io.p9.encoding;

import java.io.UnsupportedEncodingException;

public class LinkDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = "联通";

        byte[] buf = str.getBytes("gbk");//jbk编码

        for (byte b : buf) {
            System.out.println(Integer.toBinaryString(b&255));//转换位二进制
            /**
             * 11000001
             * 10101010
             * 11001101
             * 10101000
             */
        }
    }
}
