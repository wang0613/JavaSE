package cn.itcast.demo02;
/*
在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式：
直接通过子类对象访问：
                  ----等号左边是谁就优先用谁
间接通过成员方法访问成员变量：
           ---要看该方法属于谁，在哪里定义的，就优先用谁，没有则向上找
 */
public class Demo01ExtendsField {
    public static void main(String[] args) {

        Fu fu = new Fu();//创建父类对象
        System.out.println(fu.numFu);//只能使用父类的内容，没有任何子类的内容

        Zi zi = new Zi();
//        System.out.println(zi.numFu);//10
//        System.out.println(zi.numZi);//20、
        //优先用子类：200
        System.out.println(zi.num);

        //这个方法是子类的所以优先用子类，没有则向上找
        zi.methodZi();//200
        //这个方法是父类中定义的，由子类继承使用
        zi.methodFu();//100



    }
}
