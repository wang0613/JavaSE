package cn.itcast.p3.otherapi.Math;

import java.util.Random;

public class MathDemo {
    public static void main(String[] args) {

        /**
         * Math 类：提供了数学运算的方法，全部都是静态的。
         *
         *      ceil(double a)； 返回大于参数的最小整数
         *      floor(double a)； 返回小于参数的最大整数
         *      round(double a)； 返回四舍五入的整数
         *  int   max( a, b); 返两个数中最大的整数
         *
         * static double   pow( a, b); 返回a的b 次方
         * static double   random(); 返回伪随机数，大于等于0，小于1.0；
         *
         * Random 类： 把随机数封装成对对象
         *      double    nextDouble()
         *          返回下一个伪随机数，从这个随机数发生器的序列中 0.0和 1.0之间
         *      int       nextInt()
         *          返回下一个伪随机数，从这个随机数发生器的序列中均匀分布 int值。
         */
        double d1 = Math.ceil(12.56);
        double d2 = Math.floor(12.56);
        double d3 = Math.round(12.56);

//        sop("d1 = " + d1); 13
//        sop("d2 = " + d2); 12
//        sop("d3 = " + d3); 13

//        System.out.println(Math.pow(2, 6));//64.0

        Random  r = new Random();


        for (int i = 0; i < 10; i++) {
//            double d = Math.random();
//            System.out.println("d = " +Math.ceil((d*10)));

            double v = Math.ceil(Math.random()*10);//ceil()-->1-10
            double d = Math.floor(Math.random()*10) + 1;//floor()-->0-9

            int b = (int) (r.nextDouble()*6+1);//返回1-6的整数

            //里面表示范围 6-->(0-5)
            int x = r.nextInt(6)+1; //(0-5)+1 --> 1-6
            System.out.println("x = " + x);
        }

    }

    private static void sop(String s) {
        System.out.println(s);
    }

}
