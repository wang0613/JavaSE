package demo02;
/*
方法：就是把若干语句的功能集合
格式:
修饰符 返回值类型 函数名 （参数类型 参数名称··· ）{
    执行语句
    return 返回值；
}
修饰符：public static
返回值类型：产生的结果是什么类型
方法名称：方法的名字，规则和变量一样
参数类型：进入方法的数据是什么类型
参数名称：进入方法得数据对应的变量名称
ps：参数如果有都多个，用逗号分隔
方法体:方法要做的事情
return：两个作用：第一停止当前代码，第二将后面的数据类型返回值给调用处；
return后面的返回值，必须和方法名称前面的返回值类型“保持对应”
 */
public class Demo01Method {
    public static void main(String[] args) {
        printMethod();//调用格式：方法名称（）；
    }
    public static void printMethod(){
        for (int i = 0; i < 5; i++) {
            for (int j =1; j <= 20; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
