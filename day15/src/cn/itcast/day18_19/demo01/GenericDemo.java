package cn.itcast.day18_19.demo01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型:限定集合中存储的元素
 */
public class GenericDemo {
    public static void main(String[] args) {

        //明确容器中存储的元素
        ArrayList<String> al = new ArrayList();

        al.add("abc"); //public boolean add(Object obj)
        al.add("abc1");
//        al.add(4); //报错 al.add(new Integer (4))

        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
