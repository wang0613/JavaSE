package cn.itcast.p7.io.filereader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo02 {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("demo.txt");

        /**
         * 使用 read(char []) 读取文件数据， 读取的是个数 ，read(); 读取的是单个字符
         *
         * 1.先创建字符数组
         */
        char[] buf = new char[3];

//        int num = fr.read(buf);//将读取到的字符串 存储到数组中
//        //从0 一直到 读取的数字
//        System.out.println(num+ " "+new String(buf,0,num));//转换为 字符串  3 abc
//        int num1 = fr.read(buf);
//        System.out.println(num1+ " "+new String(buf,0,num1));//2 dec
//        int num2 = fr.read(buf);
//        System.out.println(num2+ " "+new String(buf));//-1 dec

        int len =  0;
        //用来判断 读取到的长度 是否为 -1 ，一次读取一组3个（2次搞定）
        while ((len = fr.read(buf)) != -1) {
            System.out.println(new String(buf,0,len)); // 0-3
        }

        fr.close();
    }
}
