package cn.itcast.demo12;

/*
抽象类：模糊，不具体
特点：
1.方法只有声明还没有实现时。，该方法就是抽象方法，需要用abstract来修饰
    抽象方法所在的类必须是抽象类
2.抽象类不可以被实例化对象，为什么，因为抽象方法没有意义
3.抽象必须有其子类覆盖重写所有的抽象方法后，该类才可以实例化对象
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
    }
}
