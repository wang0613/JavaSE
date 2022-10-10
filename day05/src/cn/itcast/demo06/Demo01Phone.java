package cn.itcast.demo06;
/*
对于已经投入使用的类，尽量不要去修改，
重新定义一个类来继承他，并添加新的内容
 */
public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("**********************");
        NewPhone newPhone = new NewPhone();
        newPhone.show();
    }
}
