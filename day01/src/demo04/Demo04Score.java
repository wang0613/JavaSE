package demo04;
/*
根据开始成绩，判断成绩等级
90-100 优秀
80-89 好
70-79 良
60-69 及格
60 以下 不及格
*/

public class Demo04Score {
    public static void main(String[] args) {
        int score = 30;
         if (score >=90 && score <=100 ){
             System.out.println("成绩优秀");
         } else if (score >= 80 && score <=89){
             System.out.println("成绩好");
         } else if (score >= 70 && score <=79){
             System.out.println("成绩良好");
         } else if (score >= 60 && score <= 69){
             System.out.println("成绩及格");
         } else if (score >=0 && score <= 59) {
             System.out.println("成绩不及格");
         } else {
             //单独处理边界之外的情况
             System.out.println("成绩错误");
         }
    }
}
