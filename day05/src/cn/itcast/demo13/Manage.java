package cn.itcast.demo13;

import java.util.ArrayList;
/*
群主的类
 */
public class Manage extends User {

    public Manage(){

    }
    public Manage(String name, int money){
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        //首先要有一个集合存储若干红包的金额
        ArrayList<Integer> redList = new ArrayList<>();
        //首先看一下，群主有多少钱
        int leftMoney = super.getMoney();
        //totalMoney发出去的钱
        if (totalMoney > leftMoney){
            System.out.println("余额不足！");
            return redList;//返回一个空集合
        }
        //扣钱,就是重新设置余额，减去发出的钱
        super.setMoney(leftMoney - totalMoney);
        //发红包，需要拆分count份
        int avg = totalMoney/ count;
        int mod = totalMoney % count;//余数，也就是除不尽的钱
        //除不尽的零头放在最后一位红包中
        //把红包呀一个一个放在集合中
        for (int i = 0; i < count -1; i++) {
            redList.add(avg);//最后一个暂不处理
        }
        //处理最后一个，把平均红包和零头给最后一个人。
        int last = avg +mod;
        redList.add(last);//也放在集合中

        return redList;

    }

}
