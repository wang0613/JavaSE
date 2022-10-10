package cn.itcast.demo01;

/*
数组常见功能：查找
 */
public class Demo01ArraySearch {
    public static void main(String[] args) {
        int[] arr = {20, 3, 8, 36, 45};
        int index = getIndex(arr, 36);
        System.out.println(index);//3
        System.out.println(arr[index]);//36
    }

    //查找所在位置的索引值
    public static int getIndex(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}

