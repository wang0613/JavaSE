package cn.itcast.day16_17.demo08;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList的练习
 * 要求：取出ArrayList 中多余的元素
 *
 * 思路： 需要一个新的容器
 */
public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("abc1");
        al.add("abc2");
        al.add("abc1");
        al.add("abc8");
        al.add("abc9");
        al.add("abc4");
        al.add("abc8");

        System.out.println("取唯一之前：" + al);
        al = getSingleElements(al);

        System.out.println("唯一元素：" + al);
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
