package cn.itcast.demo08;

/*
案例：珠穆朗玛峰
需求：世界最高峰珠穆朗玛峰8844米。加入我有一张纸，他的厚度是0.1毫米
请问我要折多少次，可以折成珠穆朗玛峰的高度？
 */
public class Demo03While {
    public static void main(String[] args) {
        double paper = 0.1;
        int count = 0;

        while (paper <= 8844300) {
            paper *= 2;
            count++;

        }
        System.out.println(count);
    }
}
