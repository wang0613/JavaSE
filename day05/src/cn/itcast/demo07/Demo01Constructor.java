package cn.itcast.demo07;

/*
继承关系中，父子类构造方法的访问特点：
1.子类的构造方法中有一个默认的super（）调用，所以一定是先调用的父类。
2。子类构造可以通过super关键字调用父类重载构造。
3.super的父类构造，必须是子类构造方法的第一个语句。不能是一个子类构造用多次super构造。
总结：
子类必须调用父类的构造方法，不写则赠送super（）；
写了则用指定的super调用，super只能有一个，必须是第一个
 */
public class Demo01Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();//构造方法创建对象时会自动执行
        /*
        父类构造方法执行了！
        子类构造方法执行
         */

    }
}
