package demo02;
/*
数组元素的反转：
 */
public class Demo01ArrayReverse {
    public static void main(String[] args) {
        int []array = {10,20,30,40,50};

        //遍历数组之前的样子
        for (int i =0; i <array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("***********************");
        /*
        初始化语句：int min = 0; max = array.length-1;
        条件判断：min < max
        步进表达式：min++，max--
        循环体：用第三个变量倒手
         */
        //首位相进的 min为第0号元素，max为最后一位元素，min每次自增，max每次减减
        for (int min = 0,max =array.length-1;min <max ; min++,max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        //再次打印输出
        for (int i =0; i <array.length;i++){
            System.out.print(array[i]+"\t");
        }

    }
}
