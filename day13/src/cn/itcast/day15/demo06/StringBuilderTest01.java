package cn.itcast.day15.demo06;
/*
将一个int数组变成字符串
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {

        int []arr = {3,1,5,9,12};
       String str = arrayToString(arr);
        System.out.println(str);

        String string = arrToString(arr);
        System.out.println("string = " + string);

    }
    //第一种方法:字符串连接
    public static String arrayToString(int [] arr) {
        
       String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1) {
                str += arr[i] +",";
            } else  {
                str += arr[i] +"]";
            }
        }
        return str;
    }
    //第二种方法 StringBuilder [优先用]
    public static String arrToString(int[] arr) {

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1) {
                sb.append(arr[i] +",") ;
            } else  {
                sb.append(arr[i] +"]");
            }
        }
        return sb.toString();
    }


}
