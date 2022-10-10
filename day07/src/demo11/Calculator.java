package demo11;

/**
 * 计算器类
 */
public class Calculator {

    //成员变量
    int numA;
    int numB;

    //成员方法
    public void add(){
        int sum ;
        sum = numA + numB;
        System.out.println("和为："+ sum);
    }
    public void sub(){
        int sub= numA -numB;
        System.out.println("差为："+ sub);
    }
    public void mul(){
        int mul = numA*numB;
        System.out.println("积为："+ mul);
    }
    public void div(){
        int div = numA /numB;
        System.out.println("商为："+ div);
    }

}
