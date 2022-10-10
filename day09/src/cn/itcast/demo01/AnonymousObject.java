package cn.itcast.demo01;
/*
匿名对象：没有名字对象
new 对象名（）.方法名；
1.当对象方法仅使用一次调用的时候，即可以简化成匿名对象。

 */
public class AnonymousObject {
    public static void main(String[] args) {
//        Car car = new Car();
        //匿名对象方式
        new Car().run();
    }
}
