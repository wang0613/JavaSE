package demo01;

public class Demo07ArrayMax {
    public static void main(String[] args) {
        int []array = new int[] {20,89,57,56,29,88,99,63};

        int max = array[0];//假设0号元素最大
        //注意：1号开始，因为0号不能和自己动手。
        for (int i = 1; i< array.length;i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);//99

    }
}
