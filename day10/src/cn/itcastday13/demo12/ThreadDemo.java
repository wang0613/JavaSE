package cn.itcastday13.demo12;

/*
线程：正在进行中的程序！
线程：就是进程中一个负责程序执行的控制单元（执行路径）。
一个进程当中可以执行多个路径，称之为：多线程

一个进程中至少有一个线程。

开启多个线程是为了同时运行多部分的代码
每一个线程都有自己的运行内容，这个内容称之为线程要执行的任务！

多线程的好处和弊端：
好处：解决了多部分运行的问题，
弊端：线程太多回到的效率降低。
其实应用程序的执行都是cpu在坐着快速切换完成的，这个切换是随机的。

JVM启动时就启动了多个线程吗，至少两个线程可以分析出来。
1.执行main函数的线程 [更多关注点]
    该线程的任务代码都在main函数中
2.垃圾回收的线程。
   调用Object中的gc（）的静态方法，运行finalize，进行垃圾回收！
如何创建线程：
1.创建一个类继承 Thread类
2.覆盖重写Thread类中的run()方法
3.直接创建Thread类的子类对象创建线程。
4.调用start方法开启线程并调用run方法。
可以通过Thread的getName获取线程的名称 Thread-编号（从0开始）
 */
public class ThreadDemo {
    public static void main(String[] args) {
/*
创建线程的目的就是为了开启一条执行路径，去运行指定的代码和其他代码同时运行。
而运行指定的代码就是这个路径的任务！

jvm创建的主线程的任务都定义在了主函数中。
而自定义的线程的任务在run方法中。
开启线程是为了运行指定的代码，所以只有继承Thread类，并复写run方法。
将运行的代码定义在run方法中即可。
 */
//        Thread t1 = new Thread();
        Demo d1 = new Demo("旺财");
        Demo d2 = new Demo("小强");
        d1.start(); //开启线程，会自动调用run方法.
        System.out.println("哈哈");
        d2.start();
//        d2.start(); 线程不能重复启动
        //3个线程互相抢资源
        System.out.println("Over···" + Thread.currentThread().getName()); //main
//        System.gc();
    }
}
/*
调用run方法和调用start方法有什么区别？
调用start方法方可启动线程，
而run方法只是thread类中的一个普通方法调用，还是在主线程里执行。
 */
