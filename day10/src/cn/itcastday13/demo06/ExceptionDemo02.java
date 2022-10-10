package cn.itcastday13.demo06;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        int []arr = new int [3];
        Demo d = new Demo();
        int num =d.method(null,-10);
        System.out.println(num);
//        System.out.println("hehe");////   这两个打印语句一个都不会执行！
    }

}
class Demo {
    public  int method(int []arr,int index) {
//        System.out.println(arr[index]);
//        System.out.println("Over"); //这两个打印语句一个都不会执行！
        if (index >= arr.length) {
            //new处异常对象并抛出，谁调用就抛给谁！
           throw  new ArrayIndexOutOfBoundsException("数组的角标越界了："+index);//可以自定义
        }
        if (index <0) {
            throw new ArrayIndexOutOfBoundsException("数组角标不能为负数："+index);
        }
        if (arr==null) {
            throw new NullPointerException("数组的引用不能为空！！！！！");//空指针异常！！
        }
        return arr[index];
    }
}
