package cn.itcast.day16_17.demo07;

import java.util.HashSet;
import java.util.Iterator;

/*
往 HashSet 里面存储 Person对象，如果姓名和年龄相同，视为同一个人，视为相同元素
 */
public class HashSetTest {
    public static void main(String[] args) {

        HashSet hs = new HashSet();
        /*
           HashSet集合数据结构是哈希表，所以存储元素的时候
           使用元素的hashCode方法来确定位置，如果位置相同，在通过元素的equals方法来确定是否相同
         */
        hs.add(new Person("lisi", 25));
        hs.add(new Person("lisi4", 26));
        hs.add(new Person("lisi8", 28));
        hs.add(new Person("lisi7", 30));
        hs.add(new Person("lisi7", 30));

        Iterator it = hs.iterator();
        while (it.hasNext()) {
            Person p = (Person) it.next();
            System.out.println(p.getName() + ":" + p.getAge());
        }
    }
}
