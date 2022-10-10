package cn.itcastday13.demo14;

/**
 * 创建线程的第一种方式： 继承Thread类 ,start()开启线程
 * 创建线程的第二种方式： 实现Runnable接口,
 * 1.实现类实现Runnable接口
 * 2.覆盖接口中的run（）方法，将线程的任务代码封装到run()方法中
 * 3.通过Thread类创建线程对象，并将Runnable接口的子类对象作为Thread类的构造函数进行传递。
 * 4.调用线程对象的start()方法开启线程。
 * <p>
 * 实现Runnable接口的好处：
 * 1.将线程的任务从线程的子类中出来，进行了单独的封装
 * 按照面对对象的思想将任务封装成了对象
 * 2.避免了Java单继承的局限性
 * 所以，创建线程的第二种方法较为常用。
 */
public class ThreadDemo {
    public static void main(String[] args) {

//        Demo d =  new Demo();
//        Demo d2 = new Demo();
//        d.run();
//        d2.run();
//        System.out.println(Thread.currentThread().getName()); //获取主线程的名称 ：main

        Demo d = new Demo(); //创建任务
        Thread t1 = new Thread(d); //开启任务
        Thread t2 = new Thread(d);
        t1.start(); //开启线程
        t2.start();
        System.out.println(Thread.currentThread().getName());

    }
}
