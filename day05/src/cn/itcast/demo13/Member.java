package cn.itcast.demo13;

import java.util.ArrayList;
import java.util.Random;
/*
普通成员
 */
public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
    //从多个红包当中随便抽取一个，给我自己
        //随机获取一个集合当中的索引值
        int index  = new Random().nextInt(list.size());//范围不能超过集合的范围
        //根据索引从集合中删除，（拿出了就没了），并拿出被删除的红包。返回值被删除的元素delta
        int  delta = list.remove(index);
        //当前成员有多少钱
        int money = super.getMoney();
        //加法，并且重新设置回去
        super.setMoney(money + delta);//先拿出本来的钱加上变动收取的钱
    }
}
