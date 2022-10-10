package demo01;
/*
ArrayIndexOutOfBoundsException数组越界异常
原因：
数组索引越界异常
 */
public class Demo05ArrayIndex {
    public static void main(String[] args) {
        int []array ={10,50,60};
        System.out.println(array[0]);//10
        System.out.println(array[1]);//50
        System.out.println(array[2]);//60

        //错误写法，
        System.out.println(array[3]);//.ArrayIndexOutOfBoundsException数组越界异常
    }
}
