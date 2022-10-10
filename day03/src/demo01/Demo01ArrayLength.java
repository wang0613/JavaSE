package demo01;
/*
数组：
数组遍历： arr。length。for i
获取数组长度arr。length
 */
public class Demo01ArrayLength {
    public static void main(String[] args) {
        int [] arr = {2,8,6,8,58};
        //数组遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr.length);//获取数组长度
    }
}
