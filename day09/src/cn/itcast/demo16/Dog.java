package cn.itcast.demo16;

public class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("狗吃shit！");
    }

    //子类的特有方法！
    void lookHome() {
        System.out.println("看家！！！");
    }

}
