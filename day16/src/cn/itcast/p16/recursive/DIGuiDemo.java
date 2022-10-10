package cn.itcast.p16.recursive;

public class DIGuiDemo {
    public static void main(String[] args) {

        /**
         * 递归：
         *  函数自身直接或者间接的调用到了自身
         *
         * 一个功能在被重复使用，并每次调用时，参与运算的结果和上一次调用有关。
         * 这时可以用递归解决问题
         *
         *  注意：
         *  1.递归一定要明确条件，否则容易栈溢出。
         *  2.注意一下递归的次数
         */
        toBin(6);
//        int sum = getNum(5); //数值过大，内存有可能异常
//        System.out.println("sum = " + sum);
    }

    public static void toBin(int num) {
        if (num > 0) {

            toBin(num / 2);
            System.out.println(num % 2);

        }

    }
    public static int getNum(int num) {

        if (num == 1)
            return 1;
        return num+(getNum(num-1)); //5+4+3+2+1
        
    }


/*  栈内存溢出
    public static void show() {

        method(); //间接调用了自身。
    }
    public static void method() {
        show();
    }    */
}
