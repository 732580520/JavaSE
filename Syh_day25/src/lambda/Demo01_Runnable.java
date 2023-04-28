package lambda;

public class Demo01_Runnable {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名对象 传递线程任务");
            }
        }).start();

        new Thread(() -> {System.out.println("lambad 表达式启动线程"); }).start();
        new Thread(()-> System.out.println("lambad 表达式简洁启动线程")).start();
    }
}
