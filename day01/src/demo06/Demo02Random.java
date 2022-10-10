package demo06;

import java.util.Random;

/*
需求：
在一个范围内0--9
随机循环打印int 数字5次
思路：
random nextInt
for
 */
public class Demo02Random {
    public static void main(String[] args) {
        Random ra = new Random();

        for (int i = 0; i < 5; i++) {
            int num = ra.nextInt(10);
            System.out.println(num);
        }

    }
}
