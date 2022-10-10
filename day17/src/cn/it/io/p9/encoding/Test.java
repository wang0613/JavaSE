package cn.it.io.p9.encoding;

import java.io.UnsupportedEncodingException;

public class Test {
    /**
     * GBK编码：
     * 在Java中，字符串“abcd” 与字符串“ab你好”的长度是一样的，都是4个字符
     * 但对应的字节数不同，一个汉字占用两个字节
     *
     * 如：对于”ab你好“，如果只取三个字节，那么子串就是ab与”你“的半个
     * 那么半个就要舍弃，如果取4个字节就是 “ab 你”，取5个字节还是 ”ab你“
     */
    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = "ab你好cd谢谢";
        int len = str.getBytes("GBK").length;

        for (int i = 0; i < len; i++) {
            System.out.println(cutStringByByte(str,i+1));
        }



    }
    public static String cutStringByByte(String str,int len) throws UnsupportedEncodingException {

        //字符串转换为字节数组
        byte[] buf = str.getBytes("GBK");

        int count = 0;
        //从最后一个元素开始
        for (int i = len-1; i>= 0;i--) {
            if (buf[i] <0) {
                count++;
            } else
                break;
        }
        if (count % 2== 0)
            return new String(buf,0,len,"GBK");
        else
            return new String(buf,0,len-1,"GBK");


    }
}
