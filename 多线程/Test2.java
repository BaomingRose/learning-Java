package TestNet;

//此类测试实现Runnable接口方式实现多线程，证明比继承Thread类更好用
//并使用synchronized关键字修饰代码块解决多线程同时处理共享资源所导致的线程安全问题
public class Test2 {
    public static void main(String[] args) {
        TicketWindow task = new TicketWindow(); //创建线程的任务类对象
        Thread t1 = new Thread(task, "窗口一");
        Thread t2 = new Thread(task, "窗口二");
        Thread t3 = new Thread(task, "窗口三");
        Thread t4 = new Thread(task, "窗口四");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

/*
class TicketWindow implements Runnable {
    private int tickets = 100;
    Object lock = new Object();     //定义任意一个对象，用作同步代码块的锁

    @Override
    public void run() {
        while (true) {
            //将处理共享资源的代码放在一个使用synchronized关键字修饰的代码块中
            synchronized (lock) {
                if (tickets > 0) {
                    Thread th = Thread.currentThread();
                    String th_name = th.getName();
                    System.out.println(th_name + "正在发售第" + tickets-- + "张票");
                }
            }
        }
    }
}
*/
