package cn.itcast.day15.demo04;

/*
给定一个数组，按照字典顺序进行从小到大排序
{"nba" "abc" "cba" "zz" "qq" "haha"}
思路：
    1.对数组的排序,
    2.for嵌套，比较和换位
    3.compareTo()
 */
public class StringTest01 {
    public static void main(String[] args) {
        String[] arr = {"nba", "abc", "cba", "zz", "qq", "haha"};
        printArray(arr);
        sortArray(arr);
        printArray(arr);

    }

    //先打印
    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + "，");
            } else {
                System.out.print(arr[i] + "]\n");
            }
        }
    }

    //排序
    public static void sortArray(String[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                //返回int，用大于0取布尔值
                if (arr[i].compareTo(arr[j]) > 0) {
                    swap(arr, i, j);
                }
            }

        }
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
