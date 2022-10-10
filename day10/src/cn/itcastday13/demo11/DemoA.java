package cn.itcastday13.demo11;

import cn.itcastday13.demo10.Demo;

/*
有了包以后，必须要加public ，没有加public的类就是在包中被封装了。
protected : （保护） 不同的包内无法访问。
 */
public class DemoA {
    public static void main(String[] args) {
        //包与包之间的访问
        Demo d = new Demo();

    }
}
