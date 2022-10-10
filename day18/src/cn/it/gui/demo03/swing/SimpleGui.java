package cn.it.gui.demo03.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 点击渐变
 */
public class SimpleGui implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui gui = new SimpleGui();
        gui.go();
    }

    public void go() {

        frame = new JFrame();
        //设置默认的关闭选项
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("change color");

        button.addActionListener(this); //添加本类的活动监听器

        //创建会直接调用
        MyDrawPanel2 drawPanel = new MyDrawPanel2();

        //按照指定区域放值 图形
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);

        frame.setSize(500,400);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint(); //鼠标点击按钮 重新绘制
    }
}
