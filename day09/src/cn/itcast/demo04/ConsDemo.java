package cn.itcast.demo04;

public class ConsDemo{
    public static void main(String[] args) {
        Person p1 =new Person("旺财",18);
        Person p2 = new Person("小强",18);

        boolean result = p2.compare(p1);
        System.out.println(result); //true



//        Person person = new Person();
//        person.speak();
}
}
