package sb;
/*
    分别使用String、StringBuffer、StringBuilder去处理字符串的频繁改动操作：
    比较它们的性能、空间使用率
 */
public class TestSB_2 {
    public static void main(String[] args) {
//        testString();             //String类耗时：2080        String类占用内存：790703192
//        testStringBuffer();       //StringBuffer类耗时：4     StringBuffer类占用内存：6293504
        testStringBuilder();        //StringBuilder类耗时：3    StringBuilder类占用内存：6291456
    }

    public static void testString() {
        //记录当前时间
        long start = System.currentTimeMillis();

        String str = "";

        //开始进行频繁改动操作
        for (int i = 1;i <= 100000;i++) {
            str += i;
        }

        //记录当前时间
        long end = System.currentTimeMillis();

        System.out.println("String类耗时：" + (end - start));

        Runtime rt = Runtime.getRuntime();
        System.out.println("String类占用内存：" + (rt.totalMemory() - rt.freeMemory()));
    }

    public static void testStringBuffer() {
        //记录当前时间
        long start = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer("");

        //开始进行频繁改动操作
        for (int i = 1;i <= 100000;i++) {
            sb.append(i);
        }

        //记录当前时间
        long end = System.currentTimeMillis();

        System.out.println("StringBuffer类耗时：" + (end - start));

        Runtime rt = Runtime.getRuntime();
        System.out.println("StringBuffer类占用内存：" + (rt.totalMemory() - rt.freeMemory()));
    }

    public static void testStringBuilder() {
        //记录当前时间
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("");

        //开始进行频繁改动操作
        for (int i = 1;i <= 100000;i++) {
            sb.append(i);
        }

        //记录当前时间
        long end = System.currentTimeMillis();

        System.out.println("StringBuilder类耗时：" + (end - start));

        Runtime rt = Runtime.getRuntime();
        System.out.println("StringBuilder类占用内存：" + (rt.totalMemory() - rt.freeMemory()));
    }
}
