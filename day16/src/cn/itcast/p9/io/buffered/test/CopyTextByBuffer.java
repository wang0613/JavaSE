package cn.itcast.p9.io.buffered.test;

import java.io.*;

public class CopyTextByBuffer {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("buf.txt");
        BufferedReader bufr = new BufferedReader(fr);

        FileWriter fw = new FileWriter("copy.txt");
        BufferedWriter bufw = new BufferedWriter(fw);

        //单个读取缓冲区
//        int ch = 0;
//        while ((ch = bufr.read()) != -1) {
//            bufw.write(ch);
//        }

        /**
         * 行 读取缓冲区
         */
        String line = null;
        while ((line = bufr.readLine()) != null) {
            bufw.write(line); //读一行，写一行
            bufw.newLine(); //换行，否则就是一排
            bufw.flush();
        }

        bufr.close();
        bufw.close();
    }
}
