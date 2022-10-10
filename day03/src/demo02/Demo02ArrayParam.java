package demo02;
/*
数组可以当做方法的参数：
当调用方法得时候，向方法的小括号进行传参，传递进去的其实是地址值。
 */
public class Demo02ArrayParam {
    public static void main(String[] args) {
        int []array = {10,50,23,89,87,55};
        System.out.println(array);//地址值
        printArray(array);//调用方法
        System.out.println("--------000000000---------------");
        printArray(array);
    }
    /*
    三要素：
    返回值类型：只是打印，没有运算，void
    方法名称：printArray
    参数列表：int[]array
     */
    public static void printArray(int []array){
        for (int i = 0; i <array.length;i++){
            System.out.println(array[i]);
        }
    }

}
