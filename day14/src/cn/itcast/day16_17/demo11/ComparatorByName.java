package cn.itcast.day16_17.demo11;

import java.util.Comparator;
/*
创建了一个根据Person类的name排序的比较器
实现Comparator接口

 */
public class ComparatorByName implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person) o1;
        Person p2 = (Person) o1;

        int temp = p1.getName().compareTo(p2.getName());
        return temp == 0 ? p1.getAge()-p2.getAge() : temp;
    }
}
