package cn.itcast.p10.io.mybuffered;

import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReaderDemo {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("buf.txt");
        MyBufferedReader mybu =new MyBufferedReader(fr);

        String line = null;
        while ((line = mybu.myReadeLine()) != null) {
            System.out.println(line);
        }
        mybu.myClose();

    }
}
