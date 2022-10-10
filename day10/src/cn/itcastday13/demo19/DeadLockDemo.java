package cn.itcastday13.demo19;
/*
死锁
 */
public class DeadLockDemo {
    public static void main(String[] args) {

        Ticket t  =new Ticket();

        Thread t1 =new Thread(t);
        Thread t2 =new Thread(t);

        t1.start();
        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {

        }
        t.flag = false;
        t2.start();
    }
}
