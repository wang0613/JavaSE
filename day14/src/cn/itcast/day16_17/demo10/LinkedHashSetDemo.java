package cn.itcast.day16_17.demo10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * HashSet：保证唯一，但是无序
 *      其子类：LinkedHashSet 有序记录，保证唯一
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {

        HashSet hs = new LinkedHashSet();

        hs.add("ehe");
        hs.add("haha");
        hs.add("huhu");
        hs.add("wuwu");

        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
