package GUI;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//该类测试窗体事件对应的方法
//窗口最小化为图标事件
//最大化为取消图标化事件
//窗口隐藏为停用事件
//重新打开为激活事件
public class Test5 {
    public static void main(String[] args) {
        final Frame f = new Frame("WindowEvent");
        f.setSize(400, 300);
        f.setLocation(300, 200);
        f.setVisible(true);

        //WindowListener 是接口， 方法都要重写 ，一个匿名内部类
        f.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("windowOpened--窗体打开事件");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing--窗体正在关闭事件");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("windowClosed--窗体关闭事件");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("windowIconfied--窗体图标化事件");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("windowDeiconified--窗体取消图标化事件");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated---窗体激活事件");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("windowDeativated--窗体停用事件");
            }
        });
    }
}
