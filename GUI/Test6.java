package GUI;

//事件适配器是抽象类，这个抽象类是implements 监听器
//事件监听器是接口
//都可以直接做匿名内部类事件其中的抽象方法

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//该类测试事件适配器
public class Test6 {
    public static void main(String[] args) {
        Frame f = new Frame("我的窗体！");
        f.setSize(400, 300);
        f.setLocation(300, 200);
        f.setVisible(true);
        f.addWindowListener(new MyWindowListener());
    }
}

//继承窗体适配器WindowAdapter类，重写windowClose()方法
class MyWindowListener extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        Window window = (Window)e.getComponent();
        window.dispose();
    }
}
