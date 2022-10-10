package cn.itcast.demo11;

public class Zi extends Fu {

    public Zi(){
        System.out.println("子类构造方法执行了！");
    }

    @Override
    public void eat(){
        System.out.println("吃饭饭！");
    }
}
