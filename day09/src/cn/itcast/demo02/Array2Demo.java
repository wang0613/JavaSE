package cn.itcast.demo02;

/*数组里面装的是数组就叫二维数组。
 二维数组[][]定义格式：
int[][]arr = new int [3][2];
解析： 二维数组中有3个一维数组:arr[0],arr[1],arr[2]，每个一维数组中有2个元素.
 */
public class Array2Demo {
    public static void main(String[] args) {

        int[][] arr = new int[3][2];//创建一个二维数组,有3个一位数组，一位数组的长度为2
        //[[I@16d3586 @左边是实体，右边是实体的哈希值
//        System.out.println(arr); //内存地址哈希值[[I@16d3586
//        System.out.println(arr[0]);//打印二维数组中角标为0的一维数组，[I@16d3586
        System.out.println(arr[0][0]);//打印二维数组中角标为0的一维数组中0号元素 ：默认0

        int[][] array = new int[3][]; //未定义一维数组的长度
        System.out.println(array[0]); //null 在为创建的情况下为null
//        System.out.println(array[0][0]); //.NullPointerException未使用异常捕获
//        array[0] =new int[3]; 数组的初始化



    }
}
