package cn.itcast.demo03;
/*
接口当中的静态方法:**不能通过实现类对象来调用
正确写法：
直接通过接口名称调用
接口名称.静态方法名（参数）；
静态和对象没有关系，和类有关系
 */
public class Demo01InterfaceStatic {
    public static void main(String[] args) {
        //创建了实现类对象
        //MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        //直接通过接口名称调用 正确方法
        MyInterfaceStatic.methodStatic();

    }
}
