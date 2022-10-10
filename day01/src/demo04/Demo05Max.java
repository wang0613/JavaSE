package demo04;
/*
* 用三元运算符和标准的if else 语句来实现：取两个数的最大值
* */
public class Demo05Max {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        //int max = a > b ? a:b;


        //定义一个max ，如果a大于b，就把a交给max。如果a小于b，就把b交给max
        int max= 0;
        if (a > b){
            max = a;
        }else if (a < b ){
            max = b;
        }
        System.out.println("最大值是：" + max);
    }
}
