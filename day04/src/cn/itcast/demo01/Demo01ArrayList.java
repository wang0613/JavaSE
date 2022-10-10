package cn.itcast.demo01;

import java.util.ArrayList;

/*
数组的长度是不可以发生改变的，但是ArrayList中的长度可以发生改变。
对于Array List来说有一个尖括号代表泛型。<E>;
泛型：也就是装在集合中的元素，统一都是什么类型。
       注意：泛型只能是引用类型，不能是基本类型。
格式：
ArrayList<参数化类型> list = new ArrayList<参数化类型>():
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合名称为list，里面全名是String字符串的数据。
        ArrayList<String> list = new ArrayList<>();
        //注意：对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
        System.out.println(list);//[]
        System.out.println("---------------------");
        //add方法向集合中添加一些数据
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);//[张三, 李四, 王五]
    }

}
