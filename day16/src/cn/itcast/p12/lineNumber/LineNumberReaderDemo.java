package cn.itcast.p12.lineNumber;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("buf.txt");

        /**
         * 行书读取：继承自缓存区。
         * getLIneNumber：获取行号
         * setLineNumber : 设置行数
         */
        LineNumberReader lnr = new LineNumberReader(fr);

        String line = null;

        lnr.setLineNumber(20); //设置从哪开始
        while ((line = lnr.readLine()) != null) {
            System.out.println(lnr.getLineNumber() + ":" + line);//获取行数
        }

        lnr.close();

    }
}
