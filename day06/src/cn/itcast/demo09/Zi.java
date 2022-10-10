package cn.itcast.demo09;

public class Zi extends Fu {
    int num = 20;

    @Override
    public void showNum() {
        System.out.println(num);
    }

    public void method(){
        System.out.println("子类方法执行了！！");
    }
    public void methodZi(){
        System.out.println("子类特有方法执行了！！");
    }

}
