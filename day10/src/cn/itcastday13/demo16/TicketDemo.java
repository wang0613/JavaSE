package cn.itcastday13.demo16;
/*
多次启动一个线程是非法的,特别是线程已经结束时，不再重新启动。

抛出：IllegalThreadStateException --如果线程已经启动。
 */
public class TicketDemo {
    public static void main(String[] args) {

        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();
        Ticket t4 = new Ticket();

        t1.start();
//        t1.start(); //多次启动一个线程是非法的
        t2.start();
        t3.start();
        t4.start();
    }
}
