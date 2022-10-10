package cn.itcast.demo05;

public interface MyInterfaceB {

    //定义一个抽象方法
    public abstract void methodB();

    public abstract void methodAbs();

    //默认方法
    public default void methodDefault(){
        System.out.println("默认方法BBB");
    }
}
