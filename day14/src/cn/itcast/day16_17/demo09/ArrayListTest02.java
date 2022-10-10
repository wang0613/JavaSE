package cn.itcast.day16_17.demo09;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList的练习 升级 ----> 存储的我是对象
 * 要求：取出唯一的元素
 */
public class ArrayListTest02 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(new Person("lisi 1",29));
        al.add(new Person("lisi 2",28));
        al.add(new Person("lisi 5",20));
        al.add(new Person("lisi 5",20));
        al.add(new Person("lisi 1",20));
        al.add(new Person("lisi 3",27));

        System.out.println(al);
        al = getSingleElements(al);

        System.out.println( al);
    }

    public static ArrayList getSingleElements(ArrayList al) {

        //1.定义一个临时容器
        ArrayList temp = new ArrayList();

        //2.迭代旧集合，拿出元素
        Iterator it = al.iterator();
        while (it.hasNext()) {
            Object obj = it.next();

            //3.判断被迭代带的元素是否在临时容器中存在 contains()
            //如果不存在 就添加
            if (!temp.contains(obj)) {
                temp.add(obj);
            }
        }
        return temp;
    }
}
