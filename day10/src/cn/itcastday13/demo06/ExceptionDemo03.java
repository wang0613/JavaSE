package cn.itcastday13.demo06;
/*
对于角标整数是不存在的，可以用角标越界表示！
对于负数为角标的情况，准备用负数异常来表述！

负数角标这种情况异常在Java中并没有定义过。
那就按照Java异常的创建思想，面对对象，将负数角标进行自定义的描述，并封装成对象！

这种自定义的问题描述成为自定义异常！
注意：如果让一个类称之为异常类，必须要继承异常体系 ，因为只有称之为异常体系的子类才具有可抛性。
       才可可以被两个关键字所操作 throws 和 throw

异常的分类：
    1.编译时检测异常：只要是Exception和其子类都是，除了特殊子类RuntimeException体系。
        这种的问题一旦出现，希望在编译时就被检测出来，就可以进行针对想的处理。
    2.编译时不检测异常（运行时异常），就是exception中的RuntimeException和其子类。
        这种问题发生，无法让功能继续，运算无法进行，更多是因为调用者导致的或者引发内部状态的改变导致的！
        这种问题一般不处理，直接编译通过，在运行时，让调用者调用程序时强行停止！
所以在自定义异常时，要么继承Exception要么继承RunTimeException
throws 和 throw的区别：
1.throws用于在函数上 throw使用在函数内。
2.throws抛出的时异常类，可以抛出多个，用逗号隔开，  而throw抛出的时异常对象

 */
public class ExceptionDemo03 {
    public static void main(String[] args) throws FuShuIndexException {
        int[] arr = new int[3];
        Demo01 d = new Demo01();
        int num = d.method(arr, -2);
        System.out.println(num);
        System.out.println("Over");

    }
}

class Demo01 {
    //声明 抛出 在函数中
    public int method(int[] arr, int index) throws FuShuIndexException  {
        if (index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("数组的角标越界了：" + index);//可以自定义
        }
        if (index < 0) {
            throw new FuShuIndexException("角标为负数啦 ！！");
            //jvm会先检测语法错误，在检测异常
         //Error:(29, 13) java: 未报告的异常错误 必须对其进行捕获或声明以便抛出
        }
        if (arr == null) {
            throw new NullPointerException("数组的引用不能为空！！！！！");//空指针异常！！
        }
        return arr[index];
    }
}

