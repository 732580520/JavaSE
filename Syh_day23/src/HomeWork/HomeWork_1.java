package HomeWork;


public class HomeWork_1 {
    public static void main(String[] args) {
        TicketThread t1 = new TicketThread("窗口一");
        TicketThread t2 = new TicketThread("窗口二");
        TicketThread t3 = new TicketThread("窗口三");
        TicketThread t4 = new TicketThread("窗口四");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
