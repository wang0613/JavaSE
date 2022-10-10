package cn.it.gui.demo01.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
    public static void main(String[] args) throws InterruptedException {

        Frame f = new Frame(); //构造一个不可见的frame

//        f.setSize(500,400);     //设置宽（横轴） 纵轴 500为像素值
//        f.setLocation(400,150); //设置出现的位置 x轴 Y轴
        f.setBounds(400,150,400,300);

        f.setLayout(new FlowLayout());//设置流式布局

        Button but = new Button("click me ！");
        f.add(but); //添加按钮

        //添加窗体的监听器
        f.addWindowListener(new WindowAdapter() {
            //覆盖closing方法，closed用不了
            @Override
            public void windowClosing(WindowEvent e) {

                System.out.println("closing············"+e);//调用一次事件打印一次
                System.exit(0); //退出Java虚拟机
            }
        });

        //在按钮上添加监听器 添加监听器找事件源  接口方法只有一个，不需要适配器
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("刘宇博 傻子");
//                System.exit(0); //点击退出
            }
        });

//        f.show();//已过时， 被setVisible取代
        f.setVisible(true);

        System.out.println("over");//多起了一个线程，负责图形化界面
    }

}