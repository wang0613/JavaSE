package cn.itcast.day18_19.demo04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericAdvanceDemo {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("abc");
        arrayList.add("hehe");

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.add(3);
        arrayList2.add(20);

        printCollection(arrayList);
        printCollection(arrayList2);

    }

    /**
     * 迭代并打印集合中的元素
     *
     * @param arrayList
     */
    //重构方法快捷键 Extract Method 【ctrl+Alt+M】
    public static void printCollection(Collection<?> arrayList) {
        //collection集合中都可以进来
        //<> 参数类型不确定  ？ 通配符
        Iterator<?> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }

}
