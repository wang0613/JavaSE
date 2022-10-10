package cn.itcast.demo10;
/*
如何直到一个父类的引用对象，本来是什么子类？
格式：
对象 instanceof 类型
这将得到一个boolean值，用来判断前面对象能不能当作后面的类型

 */
public class Demo02Instanceof {
    public static void main(String[] args) {

        //本来是一只猫
        Animal animal = new Cat();
        animal.eat();//猫吃鱼

        //如果希望调用子类的特有方法，需要向下转型
        //判断一下父类引用animal本来是不是Dog  false
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat){
            Cat cat = (Cat) animal;

            cat.catchMouse(); //成功调用  猫吃老鼠
        }


    }

}
