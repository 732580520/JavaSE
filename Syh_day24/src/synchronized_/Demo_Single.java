package synchronized_;

public class Demo_Single {
    public static void main(String[] args) {
        SingleThread s=new SingleThread();
        Thread t1=new Thread(s);
        Thread t2=new Thread(s);
        Thread t3=new Thread(s);
        Thread t4=new Thread(s);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
