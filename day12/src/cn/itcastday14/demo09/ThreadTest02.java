package cn.itcastday14.demo09;

/*
面试题:(3)
 */
public class ThreadTest02 {
    public static void main(String[] args) {

        /*
        这是创建任务的，
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable run");
            }
        }).start();

        //以子类为主

    }


}
