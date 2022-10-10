package cn.itcast.demo05;

public interface MyInterfaceA {

    //定义一个抽象方法
    public abstract void methodA();

    public abstract void methodAbs();

    //默认方法
    public default void methodDefault(){
        System.out.println("默认方法AAA");
    }
}
