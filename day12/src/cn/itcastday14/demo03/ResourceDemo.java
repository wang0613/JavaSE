package cn.itcastday14.demo03;

public class ResourceDemo {
    public static void main(String[] args) {

        //创建任务
        Resource r = new Resource();

        Input in = new Input(r);
        Output out = new Output(r);

        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
        t1.start();
        t2.start();
    }
}
