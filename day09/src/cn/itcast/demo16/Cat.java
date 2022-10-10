package cn.itcast.demo16;

public class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("猫吃fish!!");
    }

    //子类的特有方法！
    void catchMouse() {
        System.out.println("猫捉老鼠！！");
    }
}
