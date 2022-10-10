package cn.it.io.p6.bytearraystream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStream {
    public static void main(String[] args) {
        /**
         * ByteArrayOutputStream:
         * 此类实现一个输出流，其中数据被写入字节数组。 缓冲区会在数据写入时自动增长。
         * 可以使用toByteArray()和toString()检索数据。
         *
         * ByteArrayInputStream:
         * 包含一个内部缓冲区，其中包含可从流中读取的字节。
         * 内部计数器跟踪read方法提供的下一个字节。
         *
         * 关闭ByteArrayOutputStream无效,只是在操作内存。
         * 在关闭流之后可以调用此类中的方法，而不生成IOException 。
         *
         * void writeTo​(OutputStream out ); 可以将内存中的数组写入到另一个输出流
         */

        //创建源为 字节数组
        ByteArrayInputStream bis = new ByteArrayInputStream("abcdef".getBytes());

        ByteArrayOutputStream bos = new ByteArrayOutputStream();//创建目的

        //不需要创建缓冲区，因为是字节数组，内置
        int ch = 0;
        while ((ch = bis.read()) != -1) {
            bos.write(ch);
        }
        System.out.println(bos.toString()); //toString打印，或者toByteArray();

        //不需要关流


    }
}
