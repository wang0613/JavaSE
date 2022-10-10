package demo05;
/*
需求：
获取1-100之间的6的倍数的个数
思路：
1.定义变量记录个数，记录1-100变化的数
2.定义循环 遍历1-100
3.循环时进行判断
4/满足条件，个数自增
 */
public class Demo03Count {
    public static void main(String[] args) {
        int count = 0;//count变量记录个数
        //for遍历100中的数
        for (int x=1; x <= 100; x++){
            //如果取模6 后的值为0，则是6的倍数，count++
            if (x % 6 ==0){
                count++;
            }
        }
        System.out.println("6的倍数个数有：" + count);
    }
}
