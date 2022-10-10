package cn.itcast.demo02;
/*
从Java8开始，接口允许定义默认方法。
格式：
public default 返回值类型 方法名称（参数列表）{ 方法体
}
注意：接口中的默认方法，可以解决接口升级的问题。
 */
public interface  MyInterfaceDefault {
    //定义一个抽象方法
    public abstract void methodAbs();
    //新添加一个方法，如果是抽象方法，会报错，如何解决？
    //改为默认方法
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法。");
    }
}
