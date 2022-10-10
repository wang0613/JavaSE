package cn.itcast.demo02;

public class MyInterfaceDefaultA implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法！！AAA");
    }
    @Override
    public void methodDefault(){
        System.out.println("覆盖重写接口的默认方法");
    }
}
