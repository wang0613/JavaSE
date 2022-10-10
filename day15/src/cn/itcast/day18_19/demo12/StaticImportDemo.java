package cn.itcast.day18_19.demo12;

import java.util.ArrayList;
import java.util.List;

/*    import static java.util.Collections.max;
import static java.util.Collections.sort;    */
//其实导入的是类中的静态成员

import static java.util.Collections.*;  //静态导入Collections工具类中的所有成员。
// 两个类中有相同类，必须要加类名，否则会冲突

import static java.lang.System.*;

/**
 * jdk 1.5新特性： 静态导入
 */
public class StaticImportDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("nnn");
        list.add("uua");
        list.add("ppp");
        
        out.println("list = " + list);

        sort(list);
        out.println("list = " + list);

        String max = max(list); // 最大值
        out.println("max = " + max);
    }
}
