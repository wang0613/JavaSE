package demo08;

public class Test05 {
    public static void main(String[] args) {
        int []array = new int[]{1,3,-1,5,-2};//旧数组
        int []newArray = new int[array.length];//新数组

        for (int i = 0; i < array.length; i++) {
   //反转进入新数组  最后一位i=4  5-1-4=0   0号索引付给4号索引元素
            newArray[i] = array[array.length -1-i];
            System.out.println(newArray[i]);
            if (newArray[i]<0){
                newArray[i] = 0;
            }


        }
        System.out.println("新数组是：");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
