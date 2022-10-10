package cn.itcast.demo16;
/*
多态在代码中的体现：
    父类或者接口指向子类的对象；
多态的好处：
    提高了代码的扩展性。
多态的弊端：
    前期定义的内容不能使用（）后期子类的特有内容！
多态的前提：
    1.必须有关系，继承，实现
    2.要有覆盖
   ClassCaseException :类型转换异常！！
 */
public class DuoTaiDemo {
    public static void main(String[] args) {

//        Cat cat = new Cat();
//        cat.eat();
//        method(cat);
//        Dog dog = new Dog();
//        method(dog);

        method(new Cat());//调用method方法！

//     Animal animal = new Cat ();//自动类型提升 （猫对象提升为动物类型！），但是特有功能无法访问
        //作用就是限制特有功能的访问！ 专业术语：向上转型

        //向下转型的目的是为了：使用子类的特有方法！
//        Cat cat = (Cat) animal; //向下转型为 Cat 强制类型转换！
//        cat.eat();

    }

    public static void method(Animal a) { //相等于 Animal  a= new Cat ,或者是 new Dog;
        a.eat();
        //如果 传递的是Cat的话，向下转型调用子类的特有方法，
        if (a instanceof Cat) { //instanceof用来判断对象的基本类型，只能用于引用类型的判断
            Cat c = (Cat) a;
            c.catchMouse();
        } else if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.lookHome();
        }

    }
    /*public static void method(Cat cat) {
        cat.eat();
    }

    public static void method(Dog dog) {
        dog.eat();
    }*/
}
