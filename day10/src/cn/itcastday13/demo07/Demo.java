package cn.itcastday13.demo07;
/*
异常处理的规则：
1.函数内容如果需要抛出需要检测的异常，那么函数上必须要声明，
    否则必须要在函数内用try catch捕捉，否则编译失败！
2.如果都调用到了声明异常的函数，要么try catch要么throws ，否则编译失败！
3.什么catch ，什么时候throws？
    功能内容可以解决，用catch
    解决不了就throws告诉调用者，由调用者解决！
4.一个功能如果抛出可多个异常，那么调用时必须有对应的多个catch进行针对性的处理。
    内部需要有几个需要检测的异常，就抛出几个异常，抛出几个就catch几个。

 */
public class Demo {                      //声明异常
    public int method(int[] arr, int index) throws FuShuIndexException,NullPointerException {


        if (index < 0)
            throw new FuShuIndexException("角标变负数啦！");
        if (arr == null) {
            throw new NullPointerException("没有任何数组！");
        }

        return arr[index];
    }
}
