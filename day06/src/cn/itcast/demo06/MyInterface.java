package cn.itcast.demo06;
/*
接口MyInterface继承了MyInterfaceA 和 MyInterfaceB
这个子类接口中有几个抽象方法？ 4个
methodA
methodB
methodCommon
method
 */
public interface MyInterface  extends MyInterfaceA,MyInterfaceB{

    public abstract void method();
}
