package cn.itcast.day16_17.demo06;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(new Person("lisi 1 ", 20));
        al.add(new Person("lisi 2 ", 10));
        al.add(new Person("lisi 3 ", 30));

        Iterator it = al.iterator();
        while (it.hasNext()) {
//            System.out.println(((Person)it.next()).getName()+":"+((Person)it.next()).getAge());

            Person p = (Person) it.next();
            System.out.println(p.getName() + p.getAge());
        }
    }

}
