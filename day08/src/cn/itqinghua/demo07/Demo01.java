package cn.itqinghua.demo07;

public class Demo01 {
    public static void main(String[] args) {
        //实例化对象
        Student s1= new Student();
        s1.age=18;
        s1.id=1003;
        s1.name= "黄蓉";
        s1.score= 100;

        Student s2= new Student();
        s2.name= "郭靖";
        s2.score= 33;
        s2.age= 40;
        s2.id= 2001;

        StudentBiz studentBiz = new StudentBiz();
        //添加对象做作为参数，传进去
        studentBiz.addStudent(s1);
        studentBiz.addStudent(s2);
        studentBiz.showDim();
    }
}
