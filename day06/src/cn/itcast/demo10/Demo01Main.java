package cn.itcast.demo10;
/*
向上转型一定是安全的，但是有一个弊端：
对象一旦向上转型为父类，那么就无法调用子类原本特有的方法
解决方案：用对象的向下转型【还原】
还原的格式：
子类名称 对象名 = (子类名称) 父类对象；
含义：把父类对象还原成本来的子类对象
 */
public class Demo01Main {

    public static void main(String[] args) {

        //对象的向上转型，就是，父类引向子类对象
        Animal animal = new Cat();
        animal.eat();
        System.out.println("*******************");

        //对象的向下转型：子类名称 对象名 = (子类名称) 父类对象名；
        //这样可以用来调用本类的特有方法
        Cat cat = (Cat) animal;
        cat.catchMouse();

        //如果new的时候时一只猫，强制向下转为狗，是错误的
        Dog dog = (Dog) animal;

//        dog.watchHouse(); 编译时不会报错，但运行异常。
//        //java.lang.ClassCastException类的转换异常

    }

}
