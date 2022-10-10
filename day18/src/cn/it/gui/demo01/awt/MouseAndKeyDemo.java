package cn.it.gui.demo01.awt;
import java.awt.*;
import java.awt.event.*;

/**
 * 鼠标键盘 监听器演示
 */
public class MouseAndKeyDemo {

    private Frame f; //框架
    private TextField tf; //文本框
    private Button but; //按钮

    //构造函数调用方法
    public MouseAndKeyDemo() {
        init();
    }

    private void init() {
        f = new Frame("演示鼠标和键盘监听！");
        f.setBounds(400, 200, 500, 400);
        f.setLayout(new FlowLayout()); //流式布局

        //文本框可以（指定列数），（默认的文本String） （或者文本+列数）
        tf = new TextField(15); //指定列数
        but = new Button("click");

        f.add(tf); //把文本框添加到框架上
        f.add(but);

        myEvent(); //

        f.setVisible(true);
    }

    //事件监听
    private void myEvent() {

        //框架上添加关闭方法
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //给文本框上 添加键盘监听
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

//            System.out.println("key run!" +KeyEvent.getKeyText(e.getKeyCode()) + "::" + e.getKeyCode());
                //如果输入的不是数字
                int code = e.getKeyCode();
                if (!(code >= KeyEvent.VK_0 && code <= KeyEvent.VK_9)) {
//                    System.out.println("必须是数字！！");
//                    e.consume();//KeyEvent的父类 InputEvent 输入事件 consume 不按照默认打印
                    //只有输入正确是数字才会显示

                }
                //如果输入的是回车打印  ctrol回车
                if (e.isControlDown()&&e.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println("enter run······");
                }
            }
        });


        //在按钮上添加一个鼠标监听时间
        but.addMouseListener(new MouseAdapter() {

            private int count = 0; //计数器

            //mouseEntered 进入 鼠标放上去就有效果
            @Override
            public void mouseEntered(MouseEvent e) {
//                System.out.println("mouse inter！！"+count++);
                //设置文本框的文本
//                tf.setText("mouse inter！！"+count++);
            }

            //mouseClicked点击动作 单击
            @Override
            public void mouseClicked(MouseEvent e) {
                //鼠标点击次数
                if (e.getClickCount() == 2) {
                    tf.setText("double click count");
                }
//                tf.setText("mouse click！！"+count++);
//               System.out.println("mouse inter！！"+count++);
//                System.out.println(e);

            }
        });

        //再往鼠标上添加一个 活动监听器
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("action run!!");
            }
        });


    }

    public static void main(String[] args) {

        new MouseAndKeyDemo();

    }
}
