package cn.itcastday13.demo10;
/*
Object:所有类的根类。
Object时不断抽取而来的，具备着所有对象都具备的共性内容,所有的内容对象都能用。


 */
public class Person /*extends Object */{

    private int age;

    Person(int age) {
        this.age = age;
    }

   /* 比较年龄
   public boolean compare(Person p) {
        return this.age == p.age;
    }
    */
   /*
   一般都会覆盖此方法，根据对象的特有内容吗，建立判断对象是否相同的依据！
    */
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            throw new ClassCastException("类型错误！");
        }
        Person p = (Person) obj;
        return this.age == p.age;
    }
    public int hashCode() {
        return age;
    }


}
