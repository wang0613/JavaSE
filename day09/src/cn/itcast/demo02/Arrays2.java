package cn.itcast.demo02;
/*
二维数组的另一种定义格式：
int [][]arr = {{},{},{}};
 */
public class     Arrays2 {
    public static void main(String[] args) {

//        int [][]arr = new int[3][2];
//        System.out.println(arr.length);//打印二维数组的长度，其实就是打印一位数组的个数。3
//        System.out.println(arr[1].length);//2 打印二维数组中索引为1的一维数组长度
        int [][]arr = {{23,56,57},{59,60},{1,2,3,4}};
        //遍历二维数组  //第一圈打印出来的是一维数组地址值
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j]+",");
            }
        }


    }
}
