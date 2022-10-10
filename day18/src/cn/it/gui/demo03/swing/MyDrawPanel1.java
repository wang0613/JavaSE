package cn.it.gui.demo03.swing;

import javax.swing.*;
import java.awt.*;

//渐变层
public class MyDrawPanel1 extends JPanel {

    //Graphics图形的抽象基类
    public void paintComponent(Graphics g) {

        //强制转换 2d
        Graphics2D g2d = (Graphics2D) g;

                                                     //起点   开始颜色    终点   结束颜色
        GradientPaint gradient = new GradientPaint(70,70,Color.BLUE,150,150,Color.ORANGE);

        g2d.setPaint(gradient); //讲化层 转换为 渐层
        g2d.fillOval(70,70,150,150); //全部填充
    }


}
