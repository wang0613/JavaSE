package cn.itcast.demo06;
//新款手机
public class NewPhone extends Phone{

    @Override
    public void show(){
        super.show();//把父类的show（）方法拿过来重新利用
        //添加的新内容
        System.out.println("来电姓名");
        System.out.println("显示头像");
    }
}
