package cn.itcast.demo14;

/*
当一个抽象类中的方法都是抽象方法时，这时可以把抽象类用另一种形式和方式表现出来，就是：接口 interface
定义接口使用的不是class，而是interface。
对于接口中的常见成员，而且这些成员都有固定的修饰符：
1. 全局常量 public static final

2. 抽象方法 public abstract
由此得出：接口中的成员都是公共的权限。
 */
public interface AbsDemo {

    //全局常量 【psf】 快捷键 public static final可以省略不写! 【不推荐】阅读性极差
    public static final int NUM = 4;

    // public abstract 可以省略不写，jvm会默认赠送！
    public abstract void show1();
    public abstract void show2();
}
