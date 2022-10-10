package demo05;
/*
while语句需求：
显示1--10
 */
public class Demo01While {
    public static void main(String[] args) {
        int x =1;
        //x<11 相当于x<=10
        while (x<11){
            System.out.println(x);
            x++;
        }
    }

}

