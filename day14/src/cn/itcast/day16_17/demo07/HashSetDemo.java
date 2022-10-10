package cn.itcast.day16_17.demo07;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 哈希Set类
 */
public class HashSetDemo {
    public static void main(String[] args) {

        HashSet hs = new HashSet();

        hs.add("hahaha");
        hs.add("haha");
        hs.add("xixi");
        hs.add("huhu");
        hs.add("wuwu");
//        hs.add("wuwu"); 保证唯一 进不去

        //通过迭代器为 遍历 取出的顺序不一样
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        String s1 = "null";
        int i = s1.hashCode();
        System.out.println(i);

    }
}
