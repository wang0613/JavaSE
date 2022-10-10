package demo11;

public class Test03CurrentTime {
    public static void main(String[] args) {
        CurrentTime cu = new CurrentTime();
        //重新修改赋值时间
        cu.time= "2015年5月12日10点11分30秒";

        cu.show();
    }
}
