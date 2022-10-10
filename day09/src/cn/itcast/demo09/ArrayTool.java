package cn.itcast.demo09;

/**
 * @author 王海龙
 * @version v1.0
 */
public class ArrayTool {

//    private ArrayTool(){}
    //该类中的方法都是静态的，那么该类不需要创建对象，为了其他类创建对象，可以把构造函数私有化。

    /**
     * 获取元素最大值
     *
     * @param arr
     * @return getMax
     */
    public static int getMax(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return arr[maxIndex];
    }

    /**
     * 数组排序
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    /**
     * 数组元素置换位置
     *
     * @param arr
     * @param a
     * @param b
     */
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * 获取索引值
     *
     * @param arr
     * @param key
     * @return getIndex 索引
     */
    public static int getIndex(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 获取数组
     *
     * @param arr
     * @return str
     */
    public static String arrToString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                str = str + arr[i] + ",";
            } else
                str = str + arr[i] + "]";
        }
        return str;
    }
}
