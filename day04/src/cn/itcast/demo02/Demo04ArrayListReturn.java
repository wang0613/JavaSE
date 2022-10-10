package cn.itcast.demo02;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素放入小集合中，
要求使用自定义的方法来实现筛选。

返回值类型：ArrayList小集合（元素不确定）
方法名称：getSmallList
参数列表：ArrayList大集合（20个元素）

 */
public class Demo04ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();//创建一个大集合
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;//随机产生20个随机数字，范围1-100
            bigList.add(num);//把产生的随机数字，添加到大集合中
        }
        System.out.println("大集合的长度是："+bigList.size());
        for (int i = 0; i <bigList.size() ; i++) {
            System.out.print(bigList.get(i)+"、");
        }

        //创建一个小集合来接收返回的smallList，并遍历
        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("\n偶数一共有多少个："+ smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.print(smallList.get(i)+"、");
        }
    }
    //这个方法接收大集合参数，返回小集合结果
                //返回值类型         方法名        参数列表
    public static ArrayList<Integer> getSmallList (ArrayList<Integer> bigList){
        //创建一个小集合存储偶数结果
        ArrayList <Integer > smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int  num = bigList.get(i);
            if (num % 2 ==0){
                smallList.add(num);
            }
        }
        return smallList;
    }

}
