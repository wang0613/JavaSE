package demo01;
/*
所有的引用类型，都可以赋值一个null值，但是其什么都没有
数组必须他用过new初始化，才能使用其中的元素
如果只是赋值一个null，没有null进行创建
就会发生空指针异常 NullPointerException
 */
public class Demo06ArrayNull {
    public static void main(String[] args) {
        int []array = null;
        array= new int[3];//补上new之后，0就会显示出来
        System.out.println(array[0]);// java.lang.NullPointerException
    }
}
