package cn.itcast.day18_19.demo04;

import cn.itcast.day18_19.bean.Person;
import cn.itcast.day18_19.bean.Student;
import cn.itcast.day18_19.bean.Worker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 通配符演示02
 */
public class GenericAdvanceDemo02 {
    public static void main(String[] args) {

        ArrayList<Worker> arrayList = new ArrayList<Worker>();
        arrayList.add(new Worker("lisi", 30));
        arrayList.add(new Worker("wang", 18));

        ArrayList<Student> arrayList2 = new ArrayList<Student>();
        arrayList2.add(new Student("abc1", 15));
        arrayList2.add(new Student("abc2", 17));

        printCollection(arrayList);
        printCollection(arrayList2);

    }

    /**
     * 可以对集合进行限定。
     * < ? extends E> 可以接收E类型或者其子类。这叫做泛型的上限
     * <? super E>  接收E类型或者其父类型。  这叫做下限！
     * @param arrayList
     */
    public static void printCollection(Collection<? extends Person> arrayList) {
        //<Student> 只能操作Student
        //<Worker> 只能操作worker
        //<? extends Person> 只能操作继承自Person对象的子类
        Iterator<? extends Person> it = arrayList.iterator();

        while (it.hasNext()) {
//            System.out.println(it.next());
            Person p = it.next();
            System.out.println(p.getName() + "+" + p.getAge());
        }
    }

    public static void printCollection2(Collection<? super Student> arrayList) {
        Iterator<? super Student> it = arrayList.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
