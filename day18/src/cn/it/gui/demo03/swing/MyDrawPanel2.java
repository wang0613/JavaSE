package cn.it.gui.demo03.swing;

import javax.swing.*;
import java.awt.*;

//随机的渐变层
public class MyDrawPanel2 extends JPanel {

    //Graphics图形的抽象基类
    public void paintComponent(Graphics g) {

        //强制转换 2d
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

         red = (int) (Math.random() * 255);
         green = (int) (Math.random() * 255);
         blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

                                                     //起点   开始颜色    终点   结束颜色
        GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endColor);

        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100); //全部填充
    }


}
