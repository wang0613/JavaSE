package cn.itcastday14.demo04;
/*
生产者
 */
public class Producer implements Runnable {

    private Resource r; //操作这个对象
    Producer (Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.set("烤鸭");
        }

    }
}
