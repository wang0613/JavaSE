package cn.itcast.day18_19.demo04;

import cn.itcast.day18_19.bean.Person;
import cn.itcast.day18_19.bean.Student;
import cn.itcast.day18_19.bean.Worker;

import java.util.ArrayList;

/**
 * 泛型上限的体现
 * 一般存储 元素的时候用的是上限，因为这样去除都是按照上限类型来运算的，不会出现类型安全隐患
 */
public class GenericAdvanceDemo03 {
    public static void main(String[] args) {

        ArrayList<Person> al1 = new ArrayList<Person>();
        al1.add(new Person("abc1", 15));
        al1.add(new Person("abc2", 17));

        ArrayList<Student> al2 = new ArrayList<Student>();
        al2.add(new Student("abc1", 15));
        al2.add(new Student("abc2", 17));

        ArrayList<Worker> al3 = new ArrayList<Worker>();
        al3.add(new Worker("lisi", 30));
        al3.add(new Worker("wang", 18));

        ArrayList<String> al4 = new ArrayList<String>();
//        al1.addAll(al4>); 错误类型不匹配

    }


}

//class MyCollection<E> {
//    public void add(E e) {
//
//    }
//
//    public void addAll(MyCollection<? extends E> e) {
//
//    }
//}
