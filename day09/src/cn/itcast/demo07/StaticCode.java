package cn.itcast.demo07;

/*
静态代码块：
    随着类的加载而执行，而且只执行一次
作用：
    用于给类初始化。
 */
public class StaticCode {

    //静态代码块
    static {
        System.out.println("哈哈哈");
    }

    static void show() {
        System.out.println("show run");
    }
}
