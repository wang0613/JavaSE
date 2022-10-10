package cn.itcast.demo01;

public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    @Override
    public void methodAbs() {
        System.out.println("这是第一个方法！");
    }

    @Override
    public void method() {
        System.out.println("这是第二个抽象方法！");
    }
}
