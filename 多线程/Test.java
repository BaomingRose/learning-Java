package TestThread;

class T1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; ++i) {
            System.out.println("hello world " + i);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.start();
        for (int i = 0; i < 1000; ++i) {
            System.out.println("main方法内部 " + i);
        }
    }
}
