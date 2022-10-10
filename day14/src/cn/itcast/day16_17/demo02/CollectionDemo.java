package cn.itcast.day16_17.demo02;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {

        //ArrayList是集合的一种实现，实现了接口List，
        // List接口继承了Collection接口。Collection是所有集合类的父类。
        Collection coll = new ArrayList(); //多态 左边是接口，右边是实现类

//         show(coll);// [abc1, abc2, abc3]

        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        show(c1,c2);

    }

    //演示单元素
    public static void show(Collection coll) {
        //1.添加元素
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        System.out.println(coll); //直接对集合进行打印，会转换为字符串进行输出

        //2.删除元素
//        coll.remove("abc2");  删除元素就改变集合的长度
        System.out.println(coll); //[abc1, abc3]

        //清空集合
//        coll.clear();
//        System.out.println(coll);

        System.out.println(coll.contains("abc1")); //true

    }

    //演示ALl方法
    public static void show(Collection c1, Collection c2) {
        //给c1添加元素
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");

        //给c2添加元素
        c2.add("abc1");
        c2.add("aaa2");
        c2.add("aaa3");
        c2.add("aaa4");

        System.out.println("c1 = " + c1);
        System.out.println("c2 = "+ c2);
        
        //演示c1 addAll();
//        c1.addAll(c2); //将c2中的所有元素添加到 c1中
//        System.out.println("c1 = " + c1);   c1 = [abc1, abc2, abc3, abc4, aaa1, aaa2, aaa3, aaa4]

        //演示removeAll();
       /* boolean b = c1.removeAll(c2); //将两个集合中的相同元素从调用removeAll的元素中删除
        System.out.println("removeAll = " + b);*/


       //演示containsAll();
    /*    boolean b = c1.containsAll(c2); //c1包含c2里面的全部元素，才是true，否则为false
        System.out.println("b = " + b); //false*/


    //演示returnAll(); 取交集    和removerAll功能相反
        boolean b = c1.retainAll(c2); //保留和指定集合元素相同的元素到集合，删除不同元素，
        System.out.println("b = " + b);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = "+ c2);



    }
}
