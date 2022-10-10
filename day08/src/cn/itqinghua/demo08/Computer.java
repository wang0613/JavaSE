package cn.itqinghua.demo08;
/*
计算机类
 */
public class Computer {
    String name;
    int score;

    public int showFirst(){
        //随机产生1-3的数字
        int random = (int )(Math.random()*(4-1))+1;
        switch(random){
            case 1:
                System.out.println("电脑出拳：剪刀");
                break;
            case 2:
                System.out.println("电脑出拳： 石头");
                break;
            case 3:
                System.out.println("电脑出拳 : 布");
                break;

        }
        return random;
    }
}
