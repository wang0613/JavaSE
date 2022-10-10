package cn.itcast.demo05;
/*
一旦使用了Static关键字，那么这个变量不再属于对象自己，而是属于类，
凡是本类的对象，都共享同一份数据
getId学号先来后到。
 */
public class Dem01Static {
    public static void main(String[] args) {
        Student one = new Student("郭靖",30);
        one.room= "101教室";
        System.out.println("姓名："+ one.getName()+",年龄："+ one.getAge()+"，教室："
                +one.room +",学号："+ one.getId());


        Student two = new Student("黄蓉",20);
        System.out.println("姓名："+ two.getName()+",年龄："+ two.getAge()+"，教室："+
                one.room +",学号："+ two.getId());

    }

}
