package cn.itcast.demo14;
/*
通过super来调用父类的构造方法
格式 ：
super（[参数1，参数2]）
 */
public class Dog extends Animal {
    //定义一个构造方法
    public Dog(){
        super("哈皮狗");
    }
}
