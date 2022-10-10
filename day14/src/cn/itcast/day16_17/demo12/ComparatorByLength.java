package cn.itcast.day16_17.demo12;

import java.util.Comparator;
/*
return o2 - o1;降序
 */
public class ComparatorByLength implements Comparator <String> {
    @Override
    public int compare(String s1, String s2) {
        int temp = s1.length()- s2.length();

        return temp== 0 ? s1.compareTo(s2) : temp;
    }
}
