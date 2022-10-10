package cn.itcast.day18_19.demo02;

import cn.itcast.day18_19.bean.Student;

/**
 * 泛型的自定义演示
 */
public class GenericDefineDemo03 {
    public static void main(String[] args) {

//        Tool tl = new Tool();
        //对象已经向上转型
//        tl.setObject(new Worker()); 编译时不会报错，运行时异常

//        //java.lang.ClassCastException ----> worker不能被转为Student
//        Student stu = (Student) tl.getObject(); //向下转型

        Tool<Student> tool = new Tool<Student>();
//        tool.setQ(new Worker()); //编译时期就会显现出来

        Student stu = tool.getQ(); //规定了泛型，避免了向下转型


    }

}
