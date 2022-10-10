package cn.itcast.demo01;
/*
在继承关系中“子类就是一个父类”
 */
public class Demo01Extends {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //Teacher中虽然什么都没有，但是会自动继承父类Employee中的方法
        teacher.method();

        Assistant assistant = new Assistant();
        assistant.method();
    }
}
