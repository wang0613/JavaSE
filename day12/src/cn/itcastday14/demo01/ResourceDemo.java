package cn.itcastday14.demo01;

/*
多线程通讯：
多个线程处理同一资源，但是任务却不同。
 */

public class ResourceDemo {
    public static void main(String[] args) {

        //创建资源
        Resource r = new Resource();
        //创建任务
        Input  in = new Input(r);
        Output out = new Output(r);

        //创建线程，执行路径
        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
        //开启线程
        t1.start();   //涉及线程安全问题
        t2.start();
    }
}
