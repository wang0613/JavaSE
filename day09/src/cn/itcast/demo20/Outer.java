package cn.itcast.demo20;
/*
通常的使用场景：
当函数参数是接口类型时，而且接口中的方法不超过3个。
可以用匿名内部类作为实际参数进行传递！
 */
public class Outer {
    //普通内部类方式
    /*class Inner implements cn.itcast.demo20.Inner {
        @Override
        public void show1() {

        }
        @Override
        public void show2() {

        }
    }*/


    public void method() {
        //普通方式调用
        /*Inner in = new Inner();
        in.show1();
        in.show2();*/

        //匿名的方式创建 ,这样就可以调用两个方法，加上前缀 Inner in====>起一个名字
        Inner in = new Inner() {

            @Override
            public void show1() {
                System.out.println("匿名内部类方法1 run");
            }

            @Override
            public void show2() {
                System.out.println("匿名内部类方法2 run");
            }
        };
        in.show1();
        in.show2();
    }
}
