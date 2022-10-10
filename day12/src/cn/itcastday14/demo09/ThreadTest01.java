package cn.itcastday14.demo09;
/*
多线程面试提(1)：

 */
public class ThreadTest01 {
    public static void main(String[] args) {

        //这也是创建Thread的子类对象，调用start()开启线程【匿名方式】
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"··i = " + i);
                }
            }
        }.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"··i = " + i);
        }

        //创建Runnable接口的子类对象【匿名方式】
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"··i = " + i);
                }
            }
        };
        new Thread(r).start(); //创建线程，传入任务，并开启

    }
}
 