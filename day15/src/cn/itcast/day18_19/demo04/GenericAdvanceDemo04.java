package cn.itcast.day18_19.demo04;

import cn.itcast.day18_19.Comparator.CompByName;
import cn.itcast.day18_19.bean.Person;
import cn.itcast.day18_19.bean.Student;
import cn.itcast.day18_19.bean.Worker;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 泛型上限的体现
 * 一般存储 元素的时候用的是上限，因为这样去除都是按照上限类型来运算的，不会出现类型安全隐患
 */
public class GenericAdvanceDemo04 {
    public static void main(String[] args) {

        TreeSet<Person> al1 = new TreeSet<Person>(new CompByName());
        al1.add(new Person("abc2", 17));
        al1.add(new Person("qbc1", 15));

        TreeSet<Student> al2 = new TreeSet<Student>();
        al2.add(new Student("abc1", 15));
        al2.add(new Student("abc2", 17));

        TreeSet<Worker> al3 = new TreeSet<Worker>();
        al3.add(new Worker("lisi", 30));
        al3.add(new Worker("wang", 18));

        Iterator<Person> it = al1.iterator();
        while (it.hasNext()) {
            Person next = it.next();
            System.out.println("next = " + next);
        }


    }


}


