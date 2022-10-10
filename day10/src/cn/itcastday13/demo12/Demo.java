package cn.itcastday13.demo12;

public class Demo extends Thread {

    private String name;

    Demo(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //getName()是……Thread类中的方法，用于获取线程的名字。
            //Thread.currentThread() 代表当前对象。
                System.out.println(name +i+Thread.currentThread().getName() );
        }
    }
}
