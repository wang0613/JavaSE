package cn.itcast.demo02;

public class Student {

    private String name ;
    private int age;

    //无参构造constructor select
    public Student() {
    }

    //有参构造，shift 全部选中
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getter和setter全部选中
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
