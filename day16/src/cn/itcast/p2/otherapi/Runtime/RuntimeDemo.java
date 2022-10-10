package cn.itcast.p2.otherapi.Runtime;

import java.io.IOException;

/**
 * Runtime ： 每一个Java的应用程序，都有一个Runtime类实例，能够使程序与其运行的环境相连接。
 *      static Runtime     getRuntime();获取当前运行时
 */
public class RuntimeDemo {

    //r.exec("notepad.exe");需要访问本地文件，可能不存在，有异常，这里抛出，或者捕捉
    public static void main(String[] args) throws IOException, InterruptedException {

        /**
         * Runtime： 没有构造方法摘要，说明该类不能创建对象
         * 但是该类中又有非静态的方法，说明该类应该提供静态的返回该对象的方法。
         * 而且只有一个，说明Runtime类中使用了单例设计模式
         * 保证一个运行时的Java程序 对象的唯一性
         */
        Runtime  r = Runtime.getRuntime();

        //execute: 执行=====>exec简写
        //用记事本解析Java文件
//        r.exec("notepad.exe D:\\DAUM\\RuntimeDemo.java");

        Process p = r.exec("notepad.exe");

        Thread.sleep(5000); //沉睡5秒之后，杀掉子线程，抛出异常
        p.destroy();//杀掉子线程

    }
}
