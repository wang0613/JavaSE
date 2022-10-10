package cn.itcast.day18_19.demo03;

public class InterImplDemo {
    public static void main(String[] args) {

        InterImpl il = new InterImpl();
        il.show("abc");

        //要传入构造的类型
        InterImpl02<Integer> integerInterImpl02 = new InterImpl02<>();
        integerInterImpl02.show(5);
    }
}
