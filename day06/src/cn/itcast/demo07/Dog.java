package cn.itcast.demo07;

public class Dog implements Animal {
    @Override
    public void breath() {
        System.out.println("狗在呼吸！！");
    }

    @Override
    public void run() {
        System.out.println("狗在跑！！");
    }
}
