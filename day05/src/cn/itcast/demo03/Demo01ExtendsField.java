package cn.itcast.demo03;
/*
区分子类方法中重名的三种变量：
局部变量：直接写
本类中的成员变量 ： this.成员变量名
父类中的成员变量：  super.成员变量名

 */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }
}
