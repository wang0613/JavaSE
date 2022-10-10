package cn.itqinghua.demo01;

/**
 * 计算机类
 */
public class Computer {
    String name;
    int score;
    /**
     * @return电脑出拳int
     */
    //电脑出拳
    public int showFirst(){
        //随机产生1-3的数字
        int randomNum =(int)(Math.random()*(4-1))+1;
        switch (randomNum){
            case 1:
                System.out.println("电脑出拳：剪刀");
                break;
            case 2:
                System.out.println("电脑出拳：石头");
                break;
            case 3:
                System.out.println("电脑出拳：布");
                break;
            default:
                System.out.println("输入有误！！");
                break;

        }
        return randomNum;
    }
}
