package demo03;
/*
需求：
求出1-100内所有奇数的和

 */
public class Demo02Count {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i <= 100){
             sum = sum +i;//1
             i = i + 2;//加上表示3
        }
        System.out.println("所有奇数的和是：" + sum);//2500
    }
}
