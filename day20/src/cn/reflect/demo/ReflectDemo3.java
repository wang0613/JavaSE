package cn.reflect.demo;

import java.lang.reflect.Field;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {

        getFieldDemo();
    }

    /**
     * 获取字节码文件中的字段
     */
    public static void getFieldDemo() throws Exception {

        Class clazz = Class.forName("cn.reflect.bean.Person");

//        Field field = clazz.getField("age");//没带declare的只能访问公有的
        Field field1 = clazz.getDeclaredField("age"); //获取全部的
//        System.out.println("field1 = " + field1);

        //去私有字段的访问取消权限检查
        field1.setAccessible(true);//暴力访问

        Object obj = clazz.newInstance();//实例化对象

        field1.set(obj, 58); //设置字段的值

        Object o = field1.get(obj); //获取字段
        System.out.println("o = " + o);
    }
}
