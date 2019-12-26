package TestNet;

//此类测试同步方法和Test2有相同的功能
public class Test3 {
    public static void main(String[] args) {
        TicketWindow task = new TicketWindow(); //创建线程的任务类对象
        new Thread(task, "窗口一").start();
        new Thread(task, "窗口二").start();
        new Thread(task, "窗口三").start();
        new Thread(task, "窗口四").start();
    }
}

class TicketWindow implements Runnable {
    private int tickets = 1000;
    @Override
    public void run() {
        while (true) {
            sendTicket();
        }
    }

    public synchronized void sendTicket() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + "---卖出的票" + tickets--);
        } else {
            System.exit(0);
        }
    }
}
