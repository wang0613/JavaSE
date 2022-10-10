package cn.itcast.day16_17.demo11;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {

        TreeSet <Person> ts = new TreeSet <Person>(new ComparatorByName()); //传入比较器，优先使用5

        //在未实现Comparable接口的情况下，只能添加一个，否则就是 类型转换异常
        //但是在实现Comparable接口之后，添加多个对象，不会报错，但是只能添加一个
        //因为TreeSet集合 不看hashCode() 和 equals()
        /*
        准备以Person对象的年龄进行从小到大的排序
         */
        ts.add(new Person("lisi", 200));
        ts.add(new Person("wang", 50));
        ts.add(new Person("zhou", 27));
        ts.add(new Person("yang", 27));

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            //对下一个元素进行向下转型，为 Person
            Person p = (Person) it.next();
            System.out.println(p.getName() +":"+ p.getAge());
        }
    }
}
