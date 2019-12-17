package GUI;

import javax.swing.border.Border;
import java.awt.*;

//该类测试边界布局管理器（BorderLayout）
public class Test1 {
    public static void main(String[] args) {
        final Frame f = new Frame("BorderLayout");
        //设置f边界布局管理
        f.setLayout(new BorderLayout());

        f.setSize(300, 300);    //设置大小
        f.setLocation(300, 200);         //设置位置
        f.setVisible(true);                   //设置可见

        Button but1 = new Button("东");
        Button but2 = new Button("西");
        Button but3 = new Button("南");
        Button but4 = new Button("北");
        Button but5 = new Button("中");

        //将创建好的按钮添加到窗体，并设置按钮所在区域
        f.add(but1, BorderLayout.EAST);
        f.add(but2, BorderLayout.WEST);
        f.add(but3, BorderLayout.SOUTH);
        f.add(but4, BorderLayout.NORTH);
        f.add(but5, BorderLayout.CENTER);
    }
}
