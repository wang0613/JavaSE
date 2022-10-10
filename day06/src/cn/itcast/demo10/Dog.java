package cn.itcast.demo10;

public class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("狗吃shit");
    }

    public void watchHouse(){
        System.out.println("狗可以看家！");
    }
}
