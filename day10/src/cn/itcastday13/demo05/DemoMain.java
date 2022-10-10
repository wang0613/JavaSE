package cn.itcastday13.demo05;

/*
如果接口的实现类（或者是父类的子类），只需要使用唯一的一次。
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】。
匿名内部类的定义格式：
  接口名称 对象名 = new 接口名称() {
    //覆盖重写接口中的所有抽象方法
  };
  最末尾的分号不能掉。
注意事项：
1.匿名内部类在创建对象的时候只能使用唯一的一次。
2.如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类
3.匿名对象在【调用方法】的时候，只能调用唯一的一次。
4.匿名内部类是省略了【实现类或是子类】，但是匿名对象是省略了【对象名称】。
5.匿名对象和匿名内部类不是一回事。
 */
public class DemoMain {

    public static void main(String[] args) {
        //多态的写法，左父右子。
//        MyInterface impl = new MyInterfaceImpl();
//        impl.method();


        //使用匿名内部类，更加简洁，不应写实现类。
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法！");
            }
        };
        myInterface.method();//匿名内部类实现了方法！
    }
}
