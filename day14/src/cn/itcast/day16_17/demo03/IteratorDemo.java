package cn.itcast.day16_17.demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Collection集合元素的通用获取方式：
在取元素之前先要判断集合中有没有元素，
如果有，就把这个元素取出来；继续再判断，如
果还有就再取出来。一直到把集合中的所有元素全部取出。这种取出方式专业术语称为迭代。

迭代器： 取出集合元素中的方式
itit生成迭代器的while循环
itco生成Iterator迭代器的for循环
itli生成List的for循环
ritar生成从大往小遍历的for循环
 */
public class IteratorDemo {
    public static void main(String[] args) {

        Collection coll  = new ArrayList();

        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        coll.add("abc4");
        System.out.println(coll);

        //使用Collection中的iterator()方法
        //调用集合中的迭代器方法，是为了获取集合元素的迭代器对象
//        Iterator it = coll.iterator();

//        System.out.println(it.next()); //Java.util.noSuchElementException;

        //这样就取到了每一个元素 [itit]快捷键
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        //另一种写法 itco【快捷键】
        for (Iterator iterator = coll.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());

        }

    }
}
