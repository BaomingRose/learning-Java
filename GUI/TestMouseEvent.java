package GUI;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestMouseEvent {
    public static void main(String[] args) {
        final Frame f = new Frame("WindowEvent");
        f.setLayout(new FlowLayout());
        f.setSize(300, 200);
        f.setLocation(300, 200);
        f.setVisible(true);
        Button but = new Button("Button");
        f.add(but);
        but.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouseClicked-鼠标完成点击事件");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mousePress-鼠标按下事件");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouseReleased-鼠标放开事件");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("mouseEntered-鼠标进入按钮区域事件");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("mouseExited-鼠标进入按钮区域事件");
            }
        });
        f.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {}

            @Override
            public void windowClosing(WindowEvent e) {
                ((Window)e.getComponent()).dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {}

            @Override
            public void windowIconified(WindowEvent e) {}

            @Override
            public void windowDeiconified(WindowEvent e) {}

            @Override
            public void windowActivated(WindowEvent e) {}

            @Override
            public void windowDeactivated(WindowEvent e) {}
        });
    }
}
