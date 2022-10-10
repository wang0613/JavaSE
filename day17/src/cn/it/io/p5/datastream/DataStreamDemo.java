package cn.it.io.p5.datastream;

import java.io.*;

public class DataStreamDemo {
    public static void main(String[] args) throws IOException {

        writeData();//6个字节
        readData();
    }

    public static void readData() throws IOException {
        //装饰
        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));

        String s = dis.readUTF();
        System.out.println("s = " + s);
    }

    public static void writeData() throws IOException {
        /**
         * DataOutputStream​(OutputStream out)
         * 创建新数据输出流以将数据写入指定的基础输出流。
         */
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));

        dos.writeUTF("你好");//使用UTF-8编码写入，带有编码头
        dos.writeInt(2);

        dos.close();

    }
}
