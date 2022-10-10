package cn.itcast.demo10;

public class Cat  extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼！");
    }

    //子类的特有方法.对象一旦向上转型为父类，那么就无法调用子类原本特有的方法
    public void catchMouse(){
        System.out.println("猫吃老鼠！");
    }
}
