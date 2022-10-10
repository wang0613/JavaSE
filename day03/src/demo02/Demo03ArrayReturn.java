package demo02;
/*
一个方法可以有0，1，多个参数，但是只能有0或者一个返回值，不能有多个返回值
如果希望一个方法当中产生多个运算结果进行返回在，怎么办？
【解决方案】：使用一个数组作为返回值类型即可
任何数据类型都可以作为方法的参数类型，或者返回值类型
*********数组作为方法的参数，传递进去的其实就是数组的地址值
********数组作为方法的返回值，返回的其实也是数组的返回值
 */
public class Demo03ArrayReturn {

    public static void main(String[] args) {
        int [] result = calculate(20,56,89);//接收array

        //用数组result来接受返回值，调用数组result中的元素即可：
        System.out.println("main 方法接收到的返回值是：");
        System.out.println(result);//[I@16d3586接收到的是个地址值

        //result【0】相当于array【0】 即 sum
        System.out.println("总和是："+ result[0]);
        System.out.println("平均分是："+ result[1]);
    }

               //弄个数组作为返回值类型
    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        //两个数字都需要返回，需要一个数组，相当于一个袋子，数组可以保存多个结果
//        int []array = new int[2];
//        array[0] = sum;
//        array[1] = avg;
        int[] array = {sum, avg};
        System.out.println("calculate方法内部数组是：");
        System.out.println(array);//[I@16d3586  calculate收到的也是一个地址值
        return array;//把数组返回
    }
}
