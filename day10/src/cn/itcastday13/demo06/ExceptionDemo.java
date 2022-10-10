package cn.itcastday13.demo06;
/*
异常：就是在程序运行期间发生的不正常情况！

在Java中用类的形势对不正常的情况进行了描述和封装对象！
描述不正常的情况的类就被称为：异常类。
其实就是Java通过面对对象的思想对问题进行了封装！
用异常类进行描述！
不同的问题用不同的类进行具体的描述，比如：角标越界，空指针异常等等等

问题很多，意味着描述的类也很多。
将其共性进行向上抽取，形成了异常体系。

最终异常就分成了两大类：
Throwable：父类：无论是error还是异常，问题发生就应该抛出，让调用者知道并处理！
       可抛性通过两个关键字来实现：throws 和 throw凡是可以被这两个关键字所操作的类和对象都具有可抛性！
    1.一般不可处理的 Error
        特点：由jvm抛出的重大型问题，这种问题一旦抛出，直接修改程序！
    2.可以处理的 Exception
该体系的特点：
    子类的后缀名都使用其父类名作为后缀，阅读性很强！

 */
public class ExceptionDemo {
    public static void main(String[] args) {
        sleep(-20);
        int []arr = new int[1024*10201000];//内存溢出！
        //java.lang.OutOfMemoryError: Requested array size exceeds VM limit 长度过大！
        System.out.println(arr);
    }

    public static void sleep(int time) {
        if (time <0) {
            //处理方式  抛出的形势
//            new FuTime();//就代码为负的情况，这个对象会包含着问题的名称，信息，位置等信息。

        }
        if (time > 10000) {
//            new BigTime();
        }
        System.out.println("我睡、、、" + time);

    }
}
