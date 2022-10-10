package demo02;
/*
        数据类型转换
  自动数据类型转换：
    1.特点:自动完成
    2.规则：数据范围从小到大

 */

public class Demo01DateType {
    public static void main(String[] args) {
        System.out.println(1024);//这是一个整数，默认int；
        System.out.println(3.14);//这是一个浮点数。默认double；

        //左边是long类型，右边默认int；
        //int 100 赋值给long类型，符合自动转换的要求，int转为long 从小到大，
        long num1 = 100;
        System.out.println(num1);//100

        //左边double，右边float，符合从小打到大的规则，float 转变为double。
        double num2 = 2.5F;
        System.out.println(num2);//2.5

        //左边的是float 右边是 long， 符合规则，long转换为float
        float num3 = 20L;
        System.out.println(num3);//20.0



    }
}
