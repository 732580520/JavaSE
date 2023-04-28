package HomeWork;

public class SingleThread implements Runnable {
    @Override
    public void run() {
        Single instance = Single.getInstance();
        System.out.println(instance);
    }
}
