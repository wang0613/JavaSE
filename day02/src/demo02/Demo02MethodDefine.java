package demo02;
/*
定义一个两个int数字相加的方法：
返回值类型：int
方法名称：sum
参数列表： int a，int b，
方法的三中调用格式：
1.单独调用：方法名称（参数）
2.打印调用：System。out。println（方法名称（参数））
3.赋值调用：数据类型 变量名称 = 方法名称（参数）；
注意：
返回值void，这种只能用于单独调用，不能进行打印调用或者赋值调用
 */
public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(10,82);
        System.out.println("-------------");
        //打印调用
        System.out.println(sum(850,65));
        System.out.println("****************");
        //赋值调用
        int number = sum(50,89);
        number += 100;
        System.out.println(number);//239
    }
    public static int sum(int a, int b){
        System.out.println("方法执行了！！");
        int result = a + b;
        return result;
    }
}
