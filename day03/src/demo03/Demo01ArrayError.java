package demo03;
/*
修改数组中的元素
 */
public class Demo01ArrayError {
    public static void main(String[] args) {
        int []array = new int[]{10,50,69,89,2};
        System.out.println("第二位应该修改为40");
        array[1] = 40;
        System.out.println("修改后五位同学的成绩为：");
        for (int i = 0; i <array.length; i++){
            System.out.print(array[i] + "\t");
        }
    }
}
