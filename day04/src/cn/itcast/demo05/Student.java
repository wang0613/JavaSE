package cn.itcast.demo05;

public class Student {
    private int id;//学号
    private String name ;//姓名
    private int age ;//年龄
    static String room;//所在教室
    private static int idCount;//学号计数器，每当new出一个新对象时，计数器++

    public Student(){
        this.id = ++idCount;
    }
    public Student (String name,int age){
        this.name = name;
        this.age = age;
        this.id = ++idCount;
        //++idCount自增为1，先把1赋值给id，每new处一人物，count++；
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
