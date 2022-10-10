package cn.itcast.day18_19.demo11;

/**
 * jdk 1.5新特性： 函数可变参数
 * <p>
 * 其实就是一个数组,但是接收的是数组中的元素.
 * 自动将这些元素封装成数组,简化了调用者的书写.
 *
 *注意事项:
 *      可变参数类型,必须定义在参数列表的结尾处. [重点]
 */
public class ParameterDemo {
    public static void main(String[] args) {

//        newAdd();//[I@7c30a502
        int sum = newAdd(5, 5, 8, 9, 3, 7);
        System.out.println("sum = " + sum); //37

    }

    //新写法：int...arr 其实就是一个数组, 不限定位数。称之为：可变参数
    private static int newAdd(int a, int... arr/* int a */) { //错误写法,会报错,只能写在前面

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //区别： 调用方法之前，需要先创建一个数组,数组长度确定,把数组放进去
    //而新写法则不用.
    private static int add(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int add(int a, int b, int c) {
        return a + b + c;
    }

}
