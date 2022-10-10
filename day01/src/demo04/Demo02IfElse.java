package demo04;
//判断一个数是奇数还是偶数？

public class Demo02IfElse {
    public static void main(String[] args) {

        int num = 13;
        //如果数字，mo上2等于0，那么这就是一个偶数，否则就是一个奇数。
        if (num % 2 == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
