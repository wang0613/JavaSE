package demo01;

public class Demo08ArrayMin {
    public static void main(String[] args) {
        int []array = new int []{20,89,87,23,56,98,87};
        int min = array[0];

        for (int i = 1 ;i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);//20
    }
}
