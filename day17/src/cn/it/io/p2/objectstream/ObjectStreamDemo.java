package cn.it.io.p2.objectstream;

import cn.it.io.p2.objectstream.bean.Person;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 序列化： 是对象转换成一个字节序列的过程，是一个写操作
         * 反序列化： 是读取流中的二进制，转化为对象，是一个读取的操作
         */
//        writeObj();
        readObj();
    }

    //写入对象
    public static void writeObj() throws IOException {

        //将对象写入带有指定功能
        ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("obj.object"));
        //对象的存储都是.object

        //对象的序列化，被序列化的对象必须实现Serializable
        oss.writeObject(new Person("xiao", 30)); //写入的对象 必须是可序列化的

        oss.close();

    }

    //读取对象
    //解析对象需要两个条件：1.class文件 和Obj.object文件
    public static void readObj() throws IOException, ClassNotFoundException {

        /**
         * ObjectInputStream对先前使用ObjectOutputStream编写的原始数据和对象进行反序列化。
         *      其他的都读取不了
         */
        //对象的反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.object"));

        //强制转换
        Person obj = (Person) ois.readObject(); //找不到的类异常

        System.out.println(obj.getName() + ":" + obj.getAge());//xiao 30

        ois.close();


    }
}

