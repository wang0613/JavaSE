package cn.itqinghua.demo13;

public class Person {
    String name = "LiMing";

    public Person() {
        //隐式的super();
        System.out.println("execute Person() 无参构造执行了");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("全参构造执行了！！");
    }

}

class Student extends Person {
    String school = "河南林业职业学院";

    public Student() {
        //super();
        System.out.println("Student 无惨构造执行了！！");
    }

    public Student(String name, String school) {
        super(name);//传入参数
        this.school = school;
        System.out.println("Student 全参构造执行！！");
    }
}

class PostGraduate extends Student {
    String guide; //导师

    public PostGraduate() {
        System.out.println("POSTGraduate 无参 run()");
    }

    public PostGraduate(String name, String school, String guide) {
        super(name, school);
        this.guide = guide;
        System.out.println("PostGraduate 全参构造 run");
    }

}

class TestInherit {
    public static void main(String[] args) {

        PostGraduate p = null;
         p = new PostGraduate();

        System.out.println();
        p = new PostGraduate("liu","北大","wang");
    }
}
