package collection;

public class Test01 {
    public static void main(String[] args) {
        //testString();
        //testBuffer();
        testBuilder();
    }
    public static void testString(){
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 1; i < 100000; i++) {
            str += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end-start));

        Runtime r = Runtime.getRuntime();
        System.out.println("占用内存：" + (r.totalMemory()-r.freeMemory()));
    }

    public static void testBuffer(){
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("");

        for (int i = 1; i < 100000; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end-start));

        Runtime r = Runtime.getRuntime();
        System.out.println("占用内存：" + (r.totalMemory()-r.freeMemory()));
    }

    public static void testBuilder(){
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");

        for (int i = 1; i < 100000; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end-start));

        Runtime r = Runtime.getRuntime();
        System.out.println("占用内存：" + (r.totalMemory()-r.freeMemory()));
    }
}

