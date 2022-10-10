package demo08;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []nums = new int[10];
        int []count = new int[4];
        System.out.println("请输入10个数：");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
            switch(nums[i]){
                case 1:
                    count[0] ++;
                    break;
                case 2:
                    count[1]++;
                    break;
                case 3:
                    count[2]++;
                    break;
                default:
                    count[3]++;
                    break;

            }
        }

            System.out.println(count[0]);
            System.out.println(count[1]);
            System.out.println(count[2]);
            System.out.println(count[3]);

    }
}
