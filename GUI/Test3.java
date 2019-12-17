package GUI;

import java.awt.*;

//该类测试不使用布局管理器
//我觉得不使用布局管理器居多
public class Test3 {
    public static void main(String[] args) {
        Frame f = new Frame("hello");
        f.setLayout(null);
        f.setSize(300, 150);
        f.setLocation(500, 300);
        Button btn1 = new Button("press");
        Button btn2 = new Button("pop");

        //不使用布局管理器，必须调用每个组件的setSize和setLocation
        //或者调用setBounds()  四个参数依次是左上角的x,y和组件的长和宽
        btn1.setBounds(40, 60, 100, 30);
        btn2.setBounds(140, 90, 100, 30);

        f.add(btn1);
        f.add(btn2);
        f.setVisible(true);
    }
}
