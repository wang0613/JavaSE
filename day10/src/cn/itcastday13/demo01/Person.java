package cn.itcastday13.demo01;
/*
对于成员变量来说，如果使用final关键字，那么这个变量也是不可发生改变的。
1.由于成员变量具有默认值，所以用了final之后必须手动赋值。
2.对于final的成员变量要么使用直接赋值，要么使用构造方法赋值。
3.必须保证类中所有重载的构造方法，都会对final的成员变量进行赋值。
 */
public class Person {

    private final String name/* = "鹿晗"*/;

    public Person() {
        //通过构造方法赋值
        name = "关晓彤";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

  /*  public void setName(String name) {
        this.name = name;
    }*/
}
