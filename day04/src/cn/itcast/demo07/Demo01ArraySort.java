package cn.itcast.demo07;
/*
数组的冒泡排序
 */
public class Demo01ArraySort {
    public static void main(String[] args) {
        int []arr = {10,56,8,67,20};
        System.out.println("数组排序之前：");
        printArray(arr);
        System.out.println("数组排序之后：");
        sortArray(arr);
        printArray(arr);
    }

    /**数组遍历的方法
     * @param arr
     */
    public static void printArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    /**数组排序的方法
     * @param arr
     */
    public static void sortArray(int []arr){
        //数组中第一个
        for (int i = 0; i < arr.length-1; i++) {
            //定义外层循环
            //第二个
            for (int j = 0; j < arr.length-1-i; j++) {
                //定义内层循环
                if (arr[j]>arr[j+1]){
                    //比较相邻的元素，利用第三个变量倒手
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
