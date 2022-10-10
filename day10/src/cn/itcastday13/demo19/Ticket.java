package cn.itcastday13.demo19;

public class Ticket implements Runnable {

    private int num = 100;
    boolean flag = true;
    Object obj = new Object(); //自定义锁

    @Override
    public void run() {
        if (flag) {
            while (true) {
                //同步代码块内的 同步函数
                synchronized (obj) {
                    //obj锁开不了this锁
                   show();
                }
            }
        } else {
            while (true) {
                this.show();
                //this锁开不了obj锁
            }
        }
    }

    //同步函数 里面的同步代码块 this锁
    public synchronized void show() {
        synchronized (obj) {
            if (num > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + "··" + num--);
                }
            }
        }
    }
}
