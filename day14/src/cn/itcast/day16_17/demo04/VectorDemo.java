package cn.itcast.day16_17.demo04;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector v = new Vector();

        v.addElement("abc1");
        v.addElement("abc2");
        v.addElement("abc3");
        v.addElement("abc4");

        //Enumeration<E> elements() 返回此向量的组件的枚举。
        Enumeration en = v.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
        System.out.println("----Enumeration和iterator接口功能一样--------------");
        System.out.println("----Enumeration名称和方法名太长，被iterator替换了------");


        Iterator it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
