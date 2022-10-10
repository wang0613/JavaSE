package cn.itcastday13.demo15;

public class TicketDemo {
    public static void main(String[] args) {

        Ticket t = new Ticket();

        Thread th1 = new Thread(t);
        Thread th2 = new Thread(t);
        Thread th3 = new Thread(t);
        Thread th4 = new Thread(t);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        System.out.println(Thread.currentThread().getName()); //主线程main
    }
}

