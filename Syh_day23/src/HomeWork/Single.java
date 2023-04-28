package HomeWork;
//懒汉式
public class Single {
    private static Object lock = new Object();
    private Single(){

    }
    private static Single s = null;
    public static Single getInstance() {
        /*
            外层的判断可以提高程序的运行效率，当有一条线程创建完对象之后
            其他线程就不会在进入到同步代码块中。
          */

//        if ( s == null ) {
            synchronized (lock) {
                if (s == null) {
                    s = new Single();
                }
            }
//        }
        return s;
    }

}
