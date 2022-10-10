package cn.itcastday13.demo20;

public class DeadLockTest {
    public static void main(String[] args) {

        Test test1 =  new Test(true);
        Test test2 =  new Test(false);

        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test2);

        t1.start();
        t2.start();
    }
}
