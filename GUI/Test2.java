package GUI;

import java.awt.*;

//该类测试网格布局管理器（GridLayout)
public class Test2 {
    public static void main(String[] args) {
        Frame f = new Frame("GridLayout");
        //设置网格布局管理器，三行三列
        f.setLayout(new GridLayout(3, 3));
        f.setSize(300, 300);
        f.setLocation(400, 300);

        for (int i = 1; i <= 9; i++) {
            Button btn = new Button("btn" + i);
            f.add(btn);
        }
        f.setVisible(true);
    }
}
