package cn.itcast.demo01;
/*
在任何版本的Java中接口都能够定义抽象方法。
public abstract 返回值类型 方法名称（参数列表）；
 */
public interface MyInterfaceAbstract {

    //接口当中的抽象方法，修饰符必须是两个固定的关键字： public abstract ，也可以省略
    public abstract void methodAbs();

    //这也是一个抽象方法
    void method();

}
