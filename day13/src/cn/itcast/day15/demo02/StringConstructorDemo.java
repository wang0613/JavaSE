package cn.itcast.day15.demo02;

/*
String的构造方法演示：
 */
public class StringConstructorDemo {
    public static void main(String[] args) {

        StringConstructorDemo();
        StringConstructorDemo02();

    }

    public static void StringConstructorDemo() {
        String s = new String(); //等效String s = ""; 不等效 String s = null;

        byte[] arr = {65, 66, 67, 68};// 97 =a
        String s1 = new String(arr); //会把数字进行码表转换
        System.out.println("s1 = " + s1); //ABCD

    }

    public static void StringConstructorDemo02() {
        char[] arr = {'w', 'a', 'b'};
        String s = new String(arr,1,3); //从1索引开始取，到3号
        System.out.println("s = " + s);
    }
}
