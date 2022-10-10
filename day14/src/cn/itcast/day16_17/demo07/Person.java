package cn.itcast.day16_17.demo07;

public class Person extends Object {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int hashCode() {
        return name.hashCode() + age; //返回人的哈希值是否相同
    }

    @Override
    public boolean equals(Object obj) { //判断人的内容是否相同

        if (this == obj) {
            return true;
        }
        //判断是不是正确的强制类型转换异常，
        if (!(obj instanceof Person)) {
            throw new ClassCastException("类型异常！");
        }
        Person p = (Person) obj; //强转为Person

        //返回名字比较
        return this.name.equals(p.name) && (this.age == p.age);
    }
}
   