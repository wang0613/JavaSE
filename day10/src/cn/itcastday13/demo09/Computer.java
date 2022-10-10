package cn.itcastday13.demo09;

public class Computer {

    private int state = 2; //0代表电脑正常状态

    //声明异常
    public void run() throws BlueScreenException,SmokingCompException {
        //如果电脑的状态为1，电脑蓝屏
        if (state == 1) {
            throw new BlueScreenException("电脑蓝屏了！");

        }
        if (state == 2) {
            throw new SmokingCompException("电脑冒烟了");
        }
        System.out.println("电脑运行！！");
    }
    //电脑重启 ，还原回正常状态
    public void restart() {
        state = 0 ;
        System.out.println("电脑重启!");
    }
}
