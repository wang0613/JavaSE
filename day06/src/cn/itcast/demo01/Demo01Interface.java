package cn.itcast.demo01;
/*
接口就是多个类的公共规范。
接口是一种引用数据类型，最重要的内容就是其中：抽象方方法Abstract
如何定义有一个接口：
public interface 接口名称{
    //接口内容
}
注意事项：换成Interface之后编译之后还是. java ---->.class
接口中可以包含的内容：1.常量 2.抽象方法 3.默认方法 4.静态方法 5.私有方法（Java9）

接口的使用：
1.接口不能直接使用，必须要用一个”实现类“来实现接口。
public class 实现类名称 implements 接口名称{
}
2.接口的是实现类必须覆盖重写（实现）接口中所有的抽象方法
去abstract 加上方法体大括号，（覆盖重写）
如果是实现类并没有覆盖重写接口中的抽象方法，那么这个实现类必须是抽象类。
 */
public class Demo01Interface {
    public static void main(String[] args) {

        //创建实现类的对象进行使用，不能直接new接口名称
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs();
        impl.method();

    }

}
