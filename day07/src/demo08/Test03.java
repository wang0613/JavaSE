package demo08;

public class Test03 {
    public static void main(String[] args) {
        int[] points = {18, 25, 7, 36, 12, 2, 89, 63};
        int min = points[0]; //假如0号最大
        int index = 0;
        for (int i = 0; i < points.length; i++) {
            System.out.print(points[i] + "、");
            if (min > points[i]) {
                min = points[i];
                index = i;
            }
        }
        System.out.println("\n数组中最小值为：" + min);
        System.out.println("索引位置是" + index);

    }
}
