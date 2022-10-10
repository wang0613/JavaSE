package cn.itcast.demo08;
/*
三个和尚：
一个寺庙里面有三个和尚，已知他们的身高为150cm， 210cm， 165cm
请用程序判断这三个和尚的最高身高
 */
public class Demo02Compare {
    public static void main(String[] args) {
        int heightA = 150;
        int heightB = 210;
        int heightC = 165;
        int num = heightA > heightB ? heightA:heightB;
        int max = num > heightC? num:heightC;
        System.out.println("三个和尚中身高最高的是："+ max);
    }
}
