package cn.it.io.p8.stringreader;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderDemo {
    public static void main(String[] args) throws IOException {

        StringReader sr = new StringReader("sbndjdff");
        StringWriter sw = new StringWriter();

        int ch = 0;
        while ((ch = sr.read()) != -1) {
            sw.write(ch);
        }

        System.out.println("sw = " + sw);

        sr.close();
        sw.close();

    }
}
