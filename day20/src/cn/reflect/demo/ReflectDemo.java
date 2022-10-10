package cn.reflect.demo;

import cn.reflect.bean.Person;

/**
 * java的反射机制是在运行状态中，对于任意一个类(class文件)，都能够知道这个类的所有属性和方法
 * 对于任意一个对象，都能够调用它的任意一个方法和属性
 * 这种动态获取的信息以及动态调用的方法的功能称之为Java语言的发射机制
 *
 * 动态获取类中的信息，就是Java的反射机制
 * 可以理解为对类的解剖
 * 要想对字节码文件进行解剖，必须要有字节码文件对象
 * 如何获取字节码文件对象呢？
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {

//        getClassObj_1();
//        getClassObj_2();
        getClassObj_3();

    }

    /**
     * 方式一：
     * 获取字节码对象的方式：
     * 1.Object类中getClass方法
     * 想要用这种方式，必须要明确具体的类，并创建对象 ，有点麻烦
     */
    public static void getClassObj_1() {
        Person p = new Person();
        Class<? extends Person> clazz = p.getClass();

        Person p1 = new Person();
        Class<? extends Person> clazz1 = p1.getClass();

        System.out.println(clazz == clazz1);//true
    }

    /**
     * 方式二：
     * 2.任何数据类型都具备一个静态的属性 .class来获取其对应的class对象
     *      相对简单，但是还是要明确用到类中的静态成员，还是不够扩展
     */
    public static void getClassObj_2() {
        Class clazz = Person.class;
        Class clazz1 = Person.class;
        System.out.println(clazz == clazz1); //true
    }

    /**
     * 方式三：【必须掌握】
     * 只要通过给定的类的字符串名称就可以获取该类，
     * 可以使用 Class类中的方法完成 forName();
     * 这种方式只要有名称即可，更为方便，扩展性更强
     */
    public static void getClassObj_3() throws ClassNotFoundException {
        
        String className = "cn.reflect.bean.Person"; //类上必须带上包名
        
        Class c = Class.forName(className); //抛出异常

        System.out.println("c = " + c);
    }

}
