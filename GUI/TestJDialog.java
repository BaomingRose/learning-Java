package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 我学到的：
 * JFrame,JDialog是javax.swing包中最顶级的容器
 * JFrame       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   单击关闭即关闭
 * JLabel     label.setText("内容")   设置标签内容
 * 模态对话框：需要处理完该对话框才能继续与其他窗口交互的对话框
 * 非模态对话框：允许在处理对话框的同时与其他对话框交互
 * JDialog
 */
public class TestJDialog {
    public static void main(String[] args) {
        JButton btn1 = new JButton("模态对话框");
        JButton btn2 = new JButton(("非模态对话框"));
        JFrame f = new JFrame("DialogDemo");
        f.setSize(300, 250);
        f.setLocation(300, 200);
        f.setLayout(new FlowLayout());  //为内容面板设置流布局管理器
        f.add(btn1);
        f.add(btn2);
        f.setVisible(true);
        //设置单击关闭按钮默认关闭窗口
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel label = new JLabel();

        //创建对话框属于窗体f
        final JDialog dialog = new JDialog(f, "Dialog");
        dialog.setSize(220, 150);
        dialog.setLocation(350, 250);
        dialog.setLayout(new FlowLayout());
        final JButton btn3 = new JButton("确定");
        dialog.add(btn3);

        //为“模态对话框”添加单击事件
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //设置对话框为模态
                dialog.setModal(true);
                //如果JDialog窗口没有添加了JLabel标签，就把JLabel标间加上
                if (dialog.getComponents().length == 1) {
                    dialog.add(label);
                }
                //否则修改标签的内容
                label.setText("模式对话框，点击确定按钮关闭");
                //显示对话框
                dialog.setVisible(true);
            }
        });

        //为“非模态对话框”按钮添加单击事件
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setModal(false);
                if (dialog.getComponents().length == 1) {
                    dialog.add(label);
                }
                label.setText("非模式对话框，点击确定按钮关闭");
                dialog.setVisible(true);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
    }
}
