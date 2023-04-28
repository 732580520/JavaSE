package HomeWork;

public class TicketThread extends Thread {
    private static int num = 100;
    private static Object lock = new Object();
//    Ticket ticket = new Ticket();

//    public TicketThread(Ticket ticket) {
//        this.ticket = ticket;
//    }

    public TicketThread(String name) {
        super(name);
    }


    /*@Override
    public void run() {
        ticket.func();
    }*/

    public void run() {
        // 窗口一直在工作
        while (true) {
            synchronized (lock) {
                // 判断是否有车票
                if(num > 0) {
                    System.out.println(Thread.currentThread().getName() + "售票：" + num);
                    // 打印车票的时间
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 车票迭代
                    num--;
                }
            }
        }
    }
}
