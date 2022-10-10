package cn.itcast.p6.io.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter:该类没有空参构造，无法创建空参的对象。
需求：
    将一些文字存储到硬盘中
    1.操作文字，建议使用字符流，
    2.将内存中的数据写入到硬盘上， 字符流中的 输出流 Writer
    硬盘中的数据体现就是文字，找到一个可以操作文件的Writer ----》FileWriter
 */
public class FileWriterDemo {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {

        //创建一个可以往文件中写入字符数据的输入对象
        /**
         * 既然是往一个文件中存入数据，所以在创建对象是就应该明确该文件(用于存储数据的目的地)。
         *
         * 如果文件不存在，则会自动创建，如果文件存在则会覆盖。
         */
        //如果构造函数中加入true，可以实现对文件的续写！！
        FileWriter fw = new FileWriter("demo.txt",true);//文件存储到了项目下
        /**
         * 调用Writer中的 writer(String )方法，写入数据
         *
         * 其实数据写入到了 临时存储缓冲区中
         */
        fw.write("ABC "+LINE_SEPARATOR+"NBA");//换行语句 \n
        fw.write("2020");
        /**
         * 进行刷新缓冲区，直接将数据写入目标缓冲区中
         */
        fw.flush();
        /**
         * 关闭流，关闭资源，关闭之后无法写入
         * 在关闭之前，会先调用flush刷新缓冲区中的数据到目的地
         */
        fw.close();
    }
}
