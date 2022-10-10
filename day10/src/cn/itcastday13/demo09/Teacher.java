package cn.itcastday13.demo09;

public class Teacher {

    private String name;
    private Computer comp ;//老师拥有的电脑

    Teacher(String name) {
        this.name = name;
        comp = new Computer();//创建电脑对象，并赋给
    }

    //讲课的方法
    public void prelect() throws NoPlanException {
        try {
            comp.run();
            System.out.println(name +" ：讲课！！"); //电脑冒烟，无法讲课
        }
        catch (BlueScreenException e) {
            System.out.println(e.toString());
            comp.restart(); //如果蓝屏的话就是重启，然后继续讲课!
            prelect();
        }
        catch (SmokingCompException e) {
            System.out.println(e.toString());
            test();//电脑冒烟，自己做练习，抛出教学计划无法完成的异常！
            throw new NoPlanException("课时进度无法完成！"+ e.getMessage()) ;
        }
    }


    public void test() {
        System.out.println("大家练习题！！");
    }

}
