package runnable;

public class Demo_Thread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread.setPriority(10);

        myThread.setDaemon(true);
        myThread.start();
        for (int i = 1; i < 500; i++) {
            System.out.println(Thread.currentThread().getName()+"....."+i);
        }
    }

}
