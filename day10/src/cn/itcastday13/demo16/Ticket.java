package cn.itcastday13.demo16;

/*
多线程 ：案例 卖票 (1)
 */
public class Ticket extends Thread {

    public static int num = 100;

    @Override
    public void run() {
        while (true) {
            if (num > 0) {
                System.out.println(Thread.currentThread().getName() + "···" + num--);
            }
        }
    }
}
