package cn.itcast.demo11;
/*
定义了一个抽象父类
 */
public abstract  class Fu {
    //普通构造方法
    public Fu(){
        System.out.println("抽象父类构造方法");
    }
        //抽象方法
    public abstract void  eat();
}
