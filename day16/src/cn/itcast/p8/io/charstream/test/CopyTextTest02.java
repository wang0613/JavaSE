package cn.itcast.p8.io.charstream.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest02 {

    public static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {

        /**
         * 第二种方式：效率高，读取的多
         */
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("demo.txt");
            fw = new FileWriter("copy_1.txt");

            //创建临时容器，这就是缓冲区
            char[] buf = new char[BUFFER_SIZE];//容量为 常量
            //定义一个变量记录读取到的字符个数,(其实就是数组里面装的个数)
            int len = 0;
            while ((len = fr.read(buf)) != -1) {

                fw.write(buf, 0, len);//从0开始，一直到数组里面的个数，全部写入到buf里面
            }

        } catch (IOException e) {
            throw new RuntimeException("读写失败");
        } finally {

            try {
                if (fw != null)
                    fr.close();
                if (fr != null)
                    fw.close();
            } catch (IOException e) {
                throw new RuntimeException("关闭流失败！！！");
            }

        }


    }
}
