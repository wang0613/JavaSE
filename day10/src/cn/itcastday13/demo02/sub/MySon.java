package cn.itcastday13.demo02.sub;

import cn.itcastday13.demo02.MyClass;

/*
在子包里创建一个类
 */
public class MySon extends MyClass {

    public void methodSon() {
        System.out.println(super.num);
    }
}
