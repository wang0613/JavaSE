package cn.itcast.p15.io.file.demo;

import java.io.File;

/**
 * File 类：
 * 用来将文件和文件夹封装为对象，方便对文件与文件夹的属性信息进行操作
 * 流 只能操作数据。
 *
 * File对象可以作为参数传递给流的构造函数
 */
public class FileDemo {
    public static void main(String[] args) {

        constructorDemo();
    }

    //构造 演示
    public static void constructorDemo() {

        //可以将一个已存在的，或者不存在的文件或者目录 封装成file对象
        File f1 = new File("a.txt");

        File f2 = new File("D:\\","a.txt");

        File f = new File("c:\\"); //封装目录
        File f3 = new File(f,"a.txt");

        //使用系统的分割
//        File f4 = new File("c:"+System.getProperty("file.separator")+"abc\\a.txt");

        //使用file类已经封装过的
        File f4 = new File("c:"+File.separator+"abc\\a.txt");
        System.out.println(f4);
    }
}
