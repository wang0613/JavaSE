package cn.itqinghua.demo16;

public abstract class Person {
    private String name;
    private String gender ;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("抽象父类全参构造执行！！");
    }

    public Person() {
        System.out.println("抽象父类无惨构造执行！！");
    }

    public abstract void show();
}
