package cn.itcast.day16_17.demo12;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet练习：
 * 字符串进行长度排序
 */
public class TreeSetTest01 {
    public static void main(String[] args) {

        TreeSet <String>  ts = new TreeSet <String>( new ComparatorByLength());//传入自定义比较器
        ts.add("aaaa");
        ts.add("cnfgdkgvn");
        ts.add("dfgdfg");
        ts.add("aerteraaa");
        ts.add("dfgdfg");
        ts.add("sfwwd");

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
