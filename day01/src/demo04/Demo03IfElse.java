package demo04;
//判断语句 if、、else if 、、 else
/*
x 和 y 的关系如下：
如果 x>= 3,那么 y = 2x + 1;
如果 -1 < x < 3 ，那么y = 2x
如果 x <= -1 ,那么 y = 2x -1
* */
public class Demo03IfElse {
    public static void main(String[] args) {

        //满足第一个条件，其他代码不再执行。
        int x =10;
        int y ;
        if (x >= 3){
            y = 2 * x + 1;
        } else if (-1 < x && x <3){
            y = 2*x;
        }else {
            y = 2 * x - 1;
        //如果不是上面两个，那么就是最后一个。
        }
        System.out.println("结果是：" + y);//21

    }
}
