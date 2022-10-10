package cn.it.gui.demo02.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo {
    JButton button;
    JFrame frame;

    public SwingDemo() {
        go();
    }

    public void go() {
        frame = new JFrame("点击窗体");
        button = new JButton("click!!!");

        frame.getContentPane().add(button); //JFrame不能直接添加组件

        addEvent();

        frame.setSize(500,400);
        frame.setVisible(true);

    }

    //监听器方法
    public void addEvent() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("窗体关闭！！");
                System.exit(0);
            }
        });
    }


    public static void main(String[] args) {
        new SwingDemo();
    }


}
