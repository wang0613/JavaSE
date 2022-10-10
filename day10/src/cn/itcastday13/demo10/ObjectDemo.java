package cn.itcastday13.demo10;

/*
== :  基本数据类型==比较的是值，引用数据类型==比较的是内存地址
 */
public class ObjectDemo {
    public static void main(String[] args) {

        Person p1 = new Person(20);//0x0056
        Person p2 = new Person(20);//0x0023
        Person p3 = p1;//p3 == 0x0056

        Demo d = new Demo();

//        System.out.println(p1==p2);//进行的是地址值的比较 false
//        System.out.println(p1.equals(p2)); //false
//        System.out.println(p1.equals(p3)); //true
//        System.out.println(p1.equals(d)); //false
        System.out.println(p1);//Person@16d3586
        System.out.println(p1.hashCode());//23934342 哈希十进制  20
        System.out.println(Integer.toHexString(p1.hashCode())); //16d3586 转为16进制  14

    }
}
