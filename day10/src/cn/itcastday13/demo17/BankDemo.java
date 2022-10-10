package cn.itcastday13.demo17;
/*
需求：储户，两个，每个都到银行存钱，每次存100，共存3次。

 */
public class BankDemo {
    public static void main(String[] args) {

        Customer c = new Customer(); //任务
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();

    }
}
