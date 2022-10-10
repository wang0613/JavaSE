package cn.itcastday13.demo17;

public class Customer implements Runnable {

    private Bank b = new Bank();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            b.add(100); //调用同步函数
        }
    }
}
