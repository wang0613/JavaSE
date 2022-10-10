package cn.itqinghua.demo05;
/*
数组作为参数的方法
 */
public class StudentBiz {
    /**计算总分的方法
     * @param scores
     * @return sum
     */
    public double calcSum(int []scores){
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum+= scores[i];
        }
        return sum;
    }

    /**计算平均分的方法
     * @param scores
     * @return
     */
    public double calcAvg(int []scores){
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
        }
        return sum/scores.length;
    }

    /**
     * 计算最大值的方法
     * @param scores
     * @return
     */
    public double calcMax(int []scores){
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i]> max){
                max = scores[i];
            }
        }
        return max;
    }

    /**
     * 计算最小数的方法
     * @param scores
     * @return
     */
    public double calcMin(int []scores){
        int min= scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i]<min){
                min= scores[i];
            }
        }
        return min;
    }
}
