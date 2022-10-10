package cn.itcast.demo05;

//如果是在不要其中的一个抽象方法，必须把类写成抽象类
public abstract class Demo01InterfaceAbstract implements MyInterfaceA, MyInterfaceB{
    //必须覆盖重写所有的接口内容
    @Override
    public void methodA() {

    }

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodDefault() {

    }
}
