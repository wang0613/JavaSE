package cn.itcast.demo02;

/*
接口的默认方法，可以通过接口实现了进行调用
接口的默认方法，也可以被接口实现类进行覆盖重写
 */
public class Demo01Interface {
    /*
    如何使用接口中的默认方法？
    接口中的默认方法会被实现类继承下来
     */
    public static void main(String[] args) {
        //创建实例类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();//调用抽象方法，实际运行的是右侧实现类
        a.methodDefault();//调用默认方法，如果没有会向上找
        // 接口的覆盖重写接口的默认方法

        System.out.println("-------------------");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
