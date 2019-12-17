package GUI;

import java.awt.*;
import java.awt.event.*;

//该类测试CardLayout
class Cardlayout extends Frame implements ActionListener {
    Panel cardPanel = new Panel();
    Panel controlpaPanel = new Panel();
    Button nextButton, preButton;
    CardLayout cardLayout = new CardLayout();   //定义卡片布局对象

    //定义构造方法，设置卡片布局管理器的属性
    public Cardlayout() {
        setSize(300, 200);
        setVisible(true);
        //为窗口添加关闭时间监听器
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                Cardlayout.this.dispose();
            }
        });
        cardPanel.setLayout(cardLayout);
        //在cardPanel面板对象中添加3个文本标签
        cardPanel.add(new Label("第一个界面", Label.CENTER));
        cardPanel.add(new Label("第二个界面", Label.CENTER));
        cardPanel.add(new Label("第三个界面", Label.CENTER));
        //创建两个按钮
        nextButton = new Button("下一张卡片");
        preButton = new Button("上一张卡片");
        //为按钮对象注册监听器
        nextButton.addActionListener(this);
        preButton.addActionListener(this);
        //将按钮添加到controlpaPanel中
        controlpaPanel.add(preButton);
        controlpaPanel.add(nextButton);
        //将cardPanel面板放置在窗口边界布局的中间，窗口默认为边界布局
        this.add(cardPanel, BorderLayout.CENTER);
        //将controlpaPanel面板放置窗口边界布局的南区
        this.add(controlpaPanel, BorderLayout.SOUTH);
    }

    //下面试下按钮监听触发，并对触发时间做相应的处理
    @Override
    public void actionPerformed(ActionEvent e) {
        //如果单击nextbutton，执行
        if (e.getSource() == nextButton) {
            //切换面板中的组件，若当组件为最后一个组件，则显示第一个组件
            cardLayout.next(cardPanel);
        }
        if (e.getSource() == preButton) {
            cardLayout.previous(cardPanel);
        }
    }
}

public class Test4 {
    public static void main(String[] args) {
        Cardlayout cardlayout = new Cardlayout();
    }
}
