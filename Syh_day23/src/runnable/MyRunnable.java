package runnable;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 200000; i++) {
            System.out.println(Thread.currentThread().getName()+"..."+i);
        }
    }
}
