package cn.it.io.p3.randomfile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {

        /**
         *  RandomAccessFile:
         *  此类继承自object，不是io体系的子类
         *  特点：
         *  1.该对象既能读又能写。
         *  2.该对象内部维护了一个byte数组，并通过指针可以操作数组中的元素
         *  3.可以通过getFilePointer方法获取指针的位置，和通过set方法设置指针的位置
         *  4.其实就是该对象将字节输入流和输出流进行了封装
         *  5.该对象的源或者目的只能是文件，通过构造函数就可以看出
         *
         *  如果文件不存在，则创建，如果文件存在，不创建，不会覆盖。
         *
         */
//        writeFile();
        readFile();
    }

    //使用RandomAccessFile对象写入一些信息，比如姓名和年龄
    public static void writeFile() throws IOException {

        //name：文件名      mode:访问模式 : 值

        //"r" 以只读方式打开。调用结果对象的任何 write 方法都将导致抛出 IOException。
        //"rw" 打开以便读取和写入。如果该文件尚不存在，则尝试创建该文件。
        //"rws" 打开以便读取和写入，对于 "rw"，还要求对文件的内容或元数据的每个更新都同步写入到底层存储设备。
        //"rwd"   打开以便读取和写入，对于 "rw"，还要求对文件内容的每个更新都同步写入到底层存储设备
        RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");


        raf.write("张三".getBytes());//getBytes将字符串转换为字节数组
//        raf.write(607); //写入的是最低字节 a
        raf.writeInt(16); //写入4个字节


        raf.write("小强".getBytes());
        raf.writeInt(97);//解析问题

        raf.close();
    }

    //读取
    public static void readFile() throws IOException {

        RandomAccessFile raf = new RandomAccessFile("random.txt", "r");

        byte[] buf = new byte[6]; //两个中文，一个3个字节

        raf.read(buf); //读取字节数组
        String str = new String(buf);

        //通过seek来设置指针的位置，读取小强
//        raf.seek(1 * 10); //随机的读取，只要指定指针的位置即可。

        int age = raf.readInt();//readInt();从硬盘上读取4个字节，并把4个字节转换为int数字
        System.out.println(str + "::" + age);

        //获取当前指针的位置
        System.out.println("pos = " + raf.getFilePointer());//10

        raf.close();


    }
}
