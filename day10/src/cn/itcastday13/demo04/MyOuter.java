package cn.itcastday13.demo04;
/*
局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是【final】
原因：
1.new出来的对象在堆内存中。
2.局部变量是跟着方法走的，在栈内存中。
3.方法运行结束之后，立刻出栈，局部变量就会立刻消失。
4.new出来的对象会在堆内存中持续存在，直到垃圾回收为止。
 */
public class MyOuter {

    public void methodOuter() {
        final int num = 10;//方法所在的局部变量，final关键字可以省略

        class MyInner {
            public void methodInner() {
                System.out.println(num);
            }
        }
    }
}
