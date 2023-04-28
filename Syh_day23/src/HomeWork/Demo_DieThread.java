package HomeWork;

public class Demo_DieThread {
    public static void main(String[] args) throws InterruptedException {
        // 创建线程任务对象
        DieThread dt = new DieThread();
        // 创建线程对象
        Thread a = new Thread(dt);
        Thread b = new Thread(dt);
        // 启动线程任务
        a.start();
        // 线程休眠
        Thread.sleep(10);
        // 修改flag的值，让线程可以进入if语句
        dt.flag = true;
        // 启动线程
        b.start();
    }
}
