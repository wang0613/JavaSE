package cn.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        creatNewObj();
        creatNewObj_2();

    }


    //IllegalAccessException无效访问异常     InstantiationException实例化异常
    public static void creatNewObj() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //早期：new 的时候，先根据被new的类的名称找寻该类的字节码文件，并记载进内存，并创建该字节码文件对象
        //接着创建该字节码文件对应的Person对象
//        cn.reflect.bean.Person p = new cn.reflect.bean.Person();
//        System.out.println("p = " + p);

        //如今：
        String className = "cn.reflect.bean.Person";
        //找寻该名称类文件，并加载进内存，并产生class对象
        Class c = Class.forName(className);
        System.out.println("c = " + c);

        //newInstance只能获取空参的构造
        Object obj = c.newInstance();//创建新实例化 空参的
        System.out.println("obj = " + obj);
    }

    public static void creatNewObj_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

//        cn.reflect.bean.Person p = new cn.reflect.bean.Person("小强",60);

        /** newInstance只能获取空参的构造
         *当获取指定名称对应类中的所体现的对象时
         * 而对象初始化不使用空参数构造函数咋办？
         * 既然是通过指定的构造函数进行对象初始化。
         * 所以应该是先获取到构造函数 ---->通过字节码文件对象即可完成
         *  getConstructor(paramterTypes);  返回一个构造器对象，位于反射包下，里面还有字段对象，方法对象
         *  getDeclaredConstructors();可以拿到所有的构造方法，包括私有构造
         */
        String className = "cn.reflect.bean.Person ";

        Class clazz = Class.forName(className);

        //这样就获取到了指定的构造函数对象，返回一个constructor对象
        Constructor con = clazz.getConstructor(String.class, int.class);

        //通过该构造器对象的newInstance方法进行对象的初始化
        Object obj = con.newInstance("小明", 28);
    }


}
