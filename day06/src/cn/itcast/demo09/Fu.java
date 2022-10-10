package cn.itcast.demo09;

/**
 * 成员变量不会发生覆盖重写
 */
public class Fu {

    int num= 10;

    public void showNum(){
        System.out.println(num);
    }

    public void method(){
        System.out.println("父类方法执行了！！");
    }

    public void methodFu(){
        System.out.println("父类特有方法执行了！！");
    }

}
