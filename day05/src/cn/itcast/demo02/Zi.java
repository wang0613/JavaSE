package cn.itcast.demo02;

public class Zi extends Fu{
    int numZi = 20;
    int num = 200;

    public void methodZi(){
        //因为本类中有num，使用的是本类中的num
        System.out.println(num);
    }
}
