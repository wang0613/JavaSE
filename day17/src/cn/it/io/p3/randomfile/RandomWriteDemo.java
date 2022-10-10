package cn.it.io.p3.randomfile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomWriteDemo {
    public static void main(String[] args) throws IOException {

        randomWrite();
    }

    public static void randomWrite() throws IOException {

        RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");

        //往指定位置写入数据
        raf.seek(3*2);

        raf.write("赵六".getBytes());
        raf.writeInt(102);
        raf.close();
    }
}
