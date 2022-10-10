package cn.itcast.demo10;

public class Cat extends Animal {
    /*3。子类必须覆盖重写抽象父类当中的所有抽象方法。
      覆盖重写：去掉抽象方法的abstract关键字，然后补上方法体大括号。
    去掉abstract关键字，补上方法体大括号。
     */
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

}
