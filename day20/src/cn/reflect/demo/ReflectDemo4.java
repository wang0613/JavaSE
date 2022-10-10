package cn.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {

        getMethodDemo_3();
    }

    public static void getMethodDemo_3() throws Exception {
        Class clazz = Class.forName("cn.reflect.bean.Person");

        //获取带参数方法paraMethod，
        Method method = clazz.getMethod("paraMethod", String.class, int.class);

        Object obj = clazz.newInstance();
        method.invoke(obj,"小强",20);//调用方法


    }

    public static void getMethodDemo_2() throws Exception {
        Class clazz = Class.forName("cn.reflect.bean.Person");

        Method method = clazz.getMethod("show", null);//获取空参一般方法 show

//        Object obj = clazz.newInstance(); //获取对象，无惨

        Constructor constructor = clazz.getConstructor(String.class, int.class);//获取全参构造

        Object obj = constructor.newInstance("小明", 20);
        method.invoke(obj, null); //调用方法需要对象，参数列表为空


    }

    /**
     * 获取指定class中的公共方法
     */
    public static void getMethodDemo() throws Exception {

        Class clazz = Class.forName("cn.reflect.bean.Person");

        Method[] methods = clazz.getMethods();//拿到的是公有方法和object继承下来的方法

        methods = clazz.getDeclaredMethods(); //只拿到本类中所有方法，包私有
        for (Method method : methods) {
            System.out.println("method = " + method);
        }


    }
}
