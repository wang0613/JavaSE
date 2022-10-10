package cn.itcastday13.demo14;

public class Demo implements Runnable {
    //准备扩展Demo类的功能，让其中的内容可以作为线程的内容执行。
    //通过接口形式完成

    //覆盖重写Runnable 接口的抽象方法
    @Override
    public void run() {
        show();
    }

    public void show() {
        for (int i = 0; i < 10; i++) {
            //获取线程名称
            System.out.println(Thread.currentThread().getName() + "····" + i);
        }
    }


}
