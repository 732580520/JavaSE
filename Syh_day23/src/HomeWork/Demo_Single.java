package HomeWork;

public class Demo_Single {
    public static void main(String[] args) {
        SingleThread st = new SingleThread();
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);
        Thread t3 = new Thread(st);
        Thread t4 = new Thread(st);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
