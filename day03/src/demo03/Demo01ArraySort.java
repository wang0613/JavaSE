package demo03;
/*
冒泡排序：
 */
public class Demo01ArraySort {
    public static void main(String[] args) {
        int []arr = {10,56,89,87,12};
        sortArray(arr);
        printArray(arr);
    }
    /*
    定义一个排序数组的方法
    返回值类型：只进行打印，不进行运算：void
    方法名：printArray
    参数列表：int【】arr
     */
    public static void printArray(int[]arr){
        for (int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    /*
    定义一个数组排序的方法：
    返回值类型： void
    方法名：sortArray
    参数列表： int【】arr
     */
    public static void sortArray(int []arr){
        //定义外层循环,控制循环次数，最后一个不需要比较
        for (int i =0; i <arr.length-1;i++){
            for (int j = 0; j <arr.length-i-1;j++){

            if (arr[j] > arr[j+1]){
                //比较相邻元素
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            }
        }
    }
}
