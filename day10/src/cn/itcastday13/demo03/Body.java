package cn.itcastday13.demo03;
/*
Ctrl+shift+F9 编译文件

Body$Heart.class内部类的编译文件格式
 */
public class Body { //外部类

    public class Heart{//成员内部类
        //内部类的方法
        public void beat(){
            System.out.println("心脏跳动，蹦蹦！");
        }
    }
    //外部类的方法
    public void methodBody(){
        System.out.println("内部类的方法！");
//        Heart heart = new Heart();
//        heart.beat();
        //用过怕外部类的方法，创建内部类的对象来调用。
        new Heart().beat();//匿名对象
    }

}
