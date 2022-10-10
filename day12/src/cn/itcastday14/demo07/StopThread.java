package cn.itcastday14.demo07;

public class StopThread implements Runnable {
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            try {
                wait(); //true进入 t1 wait, t2进入 wait 冻结状态
            }
            catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+"···" +e);
                flag = false;
            }
            System.out.println(Thread.currentThread().getName()+"··run···");
        }
    }
    public void setFlag() {
        flag = false;
    }
 }
