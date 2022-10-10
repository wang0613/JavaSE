package cn.itcast.p14.io.transstream;

import java.io.*;

public class TransStreamDemo2 {
    public static void main(String[] args) throws IOException {

        //输入的是字节流
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

        //字节输出到到控制台
//        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        //目的地是字节流
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt")));


        String line = null;
        while ((line = bufr.readLine()) != null) {

            if ("over".equals(line)) {
                break;
            }
            bufw.write(line.toUpperCase()); //从大写写入
            bufw.newLine();
            bufw.flush();
        }
    }


}
