package cn.itcastday13.demo13;

public class ThreadDemo {
    public static void main(String[] args) {

        Demo d1 = new Demo("旺财");
        Demo d2 = new Demo("小强");
        d1.start();
        d2.start();
//        System.out.println(4/0); //异常 ArithmeticException:一个整数除以零时，抛出此类的一个实例。
        //下面的代码就不执行了
        for (int i = 0; i < 20; i++) {
            System.out.println("Over··" + Thread.currentThread().getName() + "··" + i);
        }
    }
}
