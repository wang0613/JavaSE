package cn.itcast.day18_19.demo01;

import cn.itcast.day18_19.Comparator.ComparatorByName;
import cn.itcast.day18_19.bean.Person;

import java.util.Iterator;
import java.util.TreeSet;

public class GenericDemo2 {
    public static void main(String[] args) {

        TreeSet <Person> ts = new TreeSet<Person>(new ComparatorByName());

        ts.add(new Person("lisi",20));
        ts.add(new Person("wang",25));
        ts.add(new Person("zhou",10));
        ts.add(new Person("bai",20));

        Iterator<Person> it = ts.iterator();
        while (it.hasNext()) {
            Person  p = it.next();

            //toString只能打印Person对象对应的的字符串
            //还是要getName
            System.out.println(p.getName() +":"+ p.getAge());
        }


    }
}
