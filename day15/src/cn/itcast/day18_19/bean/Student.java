package cn.itcast.day18_19.bean;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Student : " +getName() + getAge();
    }
}
