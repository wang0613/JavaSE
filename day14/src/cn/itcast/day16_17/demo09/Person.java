package cn.itcast.day16_17.demo09;

public class Person extends Object {

    private String name;
    private int age;

    public Person() {
        super();
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

    //从写toString()方法，直接调用对象引用时输出
    //否则就调用对象引用输出的是地址
    @Override
    public String toString() {
        return getName() + ":" + getAge();
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

        return this.name.equals(p.name) && (this.age == p.age);
    }
}
   