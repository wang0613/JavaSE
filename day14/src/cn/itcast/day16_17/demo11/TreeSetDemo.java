package cn.itcast.day16_17.demo11;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add("abc");
        ts.add("nba");
        ts.add("cba");
        ts.add("abd");

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); //无序的，但是自己会排序
        }
    }
}
