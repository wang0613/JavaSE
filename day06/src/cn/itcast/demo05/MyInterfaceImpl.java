package cn.itcast.demo05;
/*
Java中任何一个类其实都是Object的直接过间接的子类
 */
public class MyInterfaceImpl /*extends Object*/ implements MyInterfaceA, MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写A方法");
    }
    @Override
    public void methodB() {
        System.out.println("覆盖重写B方法");
    }
    //如果实现类所实现的AB接口中，存在重复的抽象方法，那么只需要覆盖重写一个即可。
    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB接口都有的抽象方法");
    }

    @Override
    public void methodDefault(){
        System.out.println("对多个接口中冲突的默认方法进行了覆盖重写");
    }
}
