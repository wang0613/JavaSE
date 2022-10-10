package cn.itcast.demo14;
/*
类与类之间是继承关系，类与接口之间是实现关系！
在Java中不支持多继承，因为会出现调用的不确定性。
在Java中变成了多实现

一个类可以实现多个接口。
 */
public class DemoImpl implements AbsDemo {

    @Override
    public void show1() {
        System.out.println("show 1 run");
    }

    @Override
    public void show2() {
        System.out.println("show 2 run");
    }
}
