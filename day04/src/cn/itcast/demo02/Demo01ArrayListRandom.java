package cn.itcast.demo02;

import java.util.ArrayList;
import java.util.Random;

/*
ArrayList练习;
题目：生成6个1-33之间的随机整数，添加到集合中并遍历
思路：
1.创建一个集合<Integer>
2.产生随机数字Random
3.随机产生6个数字for
4.循环内调用nextInt（int），参数是（33）+1
5.add 遍历for size get
 */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();//创建对象

        for (int i = 0; i < 5; i++) {
            int num = r.nextInt(33)+ 1;//范围是1-33
            list.add(num);//循环放入集合中

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));//get拿出索引值的元素
        }
    }
}
