package cn.itcast.demo05;

public interface MyInterface {

    public default void method(){
        System.out.println("接口的默认方法！");
    }
}
