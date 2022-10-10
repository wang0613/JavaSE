package cn.itcastday14.demo08;

/*

 */
public class Join implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "··" + i);
//            Thread.yield();
        }
    }
}

