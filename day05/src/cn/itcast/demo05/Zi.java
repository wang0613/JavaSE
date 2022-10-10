package cn.itcast.demo05;

public class Zi extends Fu {

    @Override
    //public必须大于等于父类方法的修饰符
    public String method(){
        //返回值String小于Object 正确
        return "ZI";
    }

}
