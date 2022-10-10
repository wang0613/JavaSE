package demo03;
/*
需求：
求出1-100内所有偶数的和

 */
public class Demo03Count {
    public static void main(String[] args) {
        int i = 2;
        int sum = 0;
        while (i <= 100){
            sum = sum + i;
            i = i +2;
        }
        System.out.println("1-100中 所有偶数的和是：" + sum);
    }
}
