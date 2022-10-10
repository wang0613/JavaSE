package cn.itcastday13.demo15;

/*
线程安全问题产生的原因：
1.多个线程在操作共享的数据
2.操作共享数据的线程代码有多条。

当一个线程在执行操作共享数据的多条代码时，其他线程参与了运算。
就会导致线程安全问题的产生
解决思路：
就是将多条操作共享数据的代码封装起来，当线程在执行这些代码的时候其他线程是不可以参加运算的。
在Java中同步代码块就可以解决这个问题：
    synchronized(对象) {
        需要被同步的代码
   }

同步的好处：解决了线程的安全问题
同步的弊端：相对降低了效率，因为同步外的线程都会判断同步锁，降低效率

同步的前提： 必须保证有多个线程使用用一把锁。
 */
public class Ticket implements Runnable {

    private int num = 100;
    Object obj = new Object();  //创建Object对象

    @Override
    public void run() {
        sale();
    }

    public void sale()  {
        while (true) {
            //同步代码块
            synchronized (obj) {
                if (num > 0) {
                    try {
                    
                        Thread.sleep(10);//只能catch，不能声明
                    }
                    catch (InterruptedException e) {

                    }
                    System.out.println(Thread.currentThread().getName() + "···" + num--);
                    //可能会出现0 ，-1
                }
            }
        }
    }
}