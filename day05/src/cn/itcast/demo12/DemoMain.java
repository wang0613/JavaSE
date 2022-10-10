package cn.itcast.demo12;

/*
一旦定义了抽象类，就不能直接new，只能定义下一级的子类来继承，通过子类来调用
 */
public class DemoMain {
    public static void main(String[] args) {
        DogGolden dogGolden = new DogGolden();
        dogGolden.eat();//够吃骨头
        dogGolden.sleep();      //呼呼呼！
        System.out.println("*****************************");

        Dog2Ha dog2Ha = new Dog2Ha();
        dog2Ha.eat();
        dog2Ha.sleep();
    }
}
