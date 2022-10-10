package cn.it.gui.demo03.swing;

import javax.swing.*;
import java.awt.*;

//JPanel 轻量级容器
public class MyDrawPanel extends JPanel {

    //Graphics图形的抽象基类
    public void paintComponent(Graphics g) {

        g.setColor(Color.pink); //设置颜色

        g.fillRect(20, 50, 100, 100);//设置形状

    }



}
