package HomeWork;

public class DieThread implements Runnable{
 // 声明AB两个锁对象
 private Object lock_A = new Object();
 private Object lock_B = new Object();
 // 声明变量 控制执行流程
 boolean flag = false;
 @Override
 public void run() {
  if( flag ) {
   while ( true ) {
    // 获取A锁的同步代码块
    synchronized (lock_A ) {
     System.out.println("if..lock_A 锁...");
     // 获取B锁的同步代码块
     synchronized (lock_B) {
      System.out.println("if..lock_B锁...");
       }
      }
     }
    } else {
   while (true){
    // 获取B锁的同步代码
    synchronized (lock_B) {
     System.out.println("else..lock_B锁...");
     // 获取A锁的同步代码块
     synchronized (lock_A) {
      System.out.println("else..lock_A锁...");
       }
      }
     }
    }
   }
}
