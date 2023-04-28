package runnable;

public class Demo_Runnable {
    public static void main(String[] args) {
        MyRunnable my=new MyRunnable();
        Thread t1=new Thread(my);
        for (int i = 1; i <= 200000; i++) {
            System.out.println(Thread.currentThread().getName()+"..."+i);
        }
    }

}
