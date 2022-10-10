package cn.itcastday14.demo04;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
if判断标记，只有一次，会导致不该运行的线程运行了，导致了数据错误的情况
while判断标记，解决了线程获取执行权后，是否要运行！

notify 只能唤醒一个线程，如果本方唤醒了本方，没有意义，而且while判断标记+notify会导致死锁，
notifyAll解决了，本方线程一定会唤醒对方线程的问题。

jdk1.5以后将同步和锁封装成了对象
并将操作锁的隐式方式定义到了该对象中
将隐式的动作变成了显示动作

lock替代了synchronize方法和语句的使用
Condition替代了Object监视器方法（wait()，notify(),notifyAll()）的使用

Lock接口：它的出现替换了同步函数和同步代码块，将同步的隐式操作变成了现实锁的操作
同时更为灵活，可以一个锁上加上多组监视器
Lock()：  获取锁
unlock():  释放锁，通常定义在finally代码块中

Condition接口：它的出现替换了Object中的wait(),notify(),notifyAll().
讲这些监视器的方法单独进行了封装，变成了Condition监视器对象。
可以进行任意的组合。
await():
signal():
signalAll();

 */
public class Resource {

    private String name;
    private int count = 1;
    private boolean flag = false;

    Lock lock = new ReentrantLock();// 创建一个锁对象
    //通过已有的锁获取该锁上的监视器对象
//    Condition con = lock.newCondition();

    //通过已有的锁，获取两组监视器，一组监视生产者，一组监视消费者
    Condition producer_con = lock.newCondition();
    Condition customer_con = lock.newCondition();

    public void set(String name) {
        lock.lock();  //获取锁
        try {
            //如果为true ，有东西，就去等待 ，没有就去生产
            while (flag) {
                try {
//                    lock.wait();
                    //新的代码
                    producer_con.await();
                }
                catch (InterruptedException e) {
                }
            }
            //带上编号
            this.name = name + count;
            count++;
            System.out.println(Thread.currentThread().getName() + "··生产者5.0····" + this.name);
            flag = true;
//            notifyAll();  //生产一只，唤醒输出线程
            //可以唤醒所有线程，避免出现死锁的情况
//            con.signalAll(); //notifyAll();
            customer_con.signal();//唤醒消费者的线程
        }
        finally {
            lock.unlock(); //关锁
        }
    }

    public void out() {
        lock.lock();
        try {
            while (!flag) {
                try {
//                    lock.wait();
                    customer_con.await();
                }
                catch (InterruptedException e) {
                }
            }
            System.out.println(Thread.currentThread().getName() + "··新消费者··" + this.name);
            flag = false;
//            notifyAll();
//            con.signalAll(); //唤醒相当于== notifyAll();
            producer_con.signal();//用生产者的监视器唤醒生产者的线程
        }
        finally {
            lock.unlock();
        }


    }
}
