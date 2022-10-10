package cn.itcastday13.demo20;

/**
 * 死锁实例：
 */
public class Test implements Runnable {

    private boolean flag;

    Test(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {

        if (flag) {
            //死循环让它使劲转
            while (true) {
                synchronized (MyLock.lockA) {
                    System.out.println(Thread.currentThread().getName() + "··if ···lock A");
                    synchronized (MyLock.lockB) {
                        System.out.println(Thread.currentThread().getName() + "··if ···lock B");
                    }
                }
            }
        } else {
            while (true) {
                synchronized (MyLock.lockB) {
                    System.out.println(Thread.currentThread().getName() + "··else ···lock B");
                    synchronized (MyLock.lockA) {
                        System.out.println(Thread.currentThread().getName() + "··else ···lock A");
                    }
                }
            }
        }
    }
}
