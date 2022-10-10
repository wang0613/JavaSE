package demo01;
/*
continue 语句：
用在循环语句中：终止本次循环执行下一次循环。
题目：
100内奇数相加得到和

 */
public class Demo06Continue {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=  100; i++) {
            if (i % 2 ==0){
                continue;//如果I 是一个偶数，不累加，结束本次循环，进行下一次循环。
            }
            sum += i;//相当于sum = sum+i；
        }
        System.out.println("100内奇数的和是："+ sum);
    }
}
