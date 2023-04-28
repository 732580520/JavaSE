package sb;
/*
    演示StringBuilder类的常用构造和方法
 */
public class TestSB_1 {
    public static void main(String[] args) {
        test3();
    }

    public static void test3() {
        /*
            改操作：
                    reverse
                    setCharAt
                    setLength
         */
        //优化作业 ==> 是否是回文那题
        String content = "上海自来水来自海上1";

        //类型转换：String -> StringBuilder
        StringBuilder sb = new StringBuilder(content);
        //将sb中的字符串内容进行反转
        sb.reverse();
        //类型转换：StringBuilder -> String
        //方式一：
//        String newContent = new String(sb);

        //方式二：
        String newContent = sb.toString();
        System.out.println(content.equals(newContent) ? "是回文" : "不是回文");

        System.out.println("**********************************");

        StringBuilder sb2 = new StringBuilder("helloworldjavascript");
        System.out.println(sb2);

        //需求1：将sb2对象的容量设置为10个长度
        sb2.setLength(10);
        System.out.println(sb2);        //"helloworld"

        //需求2：将字符串内容w -> W
        sb2.setCharAt(5, 'W');
        System.out.println(sb2);

    }

    public static void test2() {
        StringBuilder sb = new StringBuilder("helloabc0world");
        System.out.println(sb);
        /*
            删操作：
                   delete
                   deleteCharAt
         */
        //需求1：删除中间的"abc"数据
        sb.delete(5, 8);
        System.out.println(sb);

        //需求2：删除中间的'0'数据
//        sb.deleteCharAt(5);
        sb.delete(5, 6);
        System.out.println(sb);
    }

    public static void test1() {
        //空参构造
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        /*
            增操作：
                    append
                    insert
         */
        //需求1：尾巴追加数据    ==> append
        sb.append("abc").append(123).append(3.14).append(true);
        System.out.println(sb);     //缓冲区对象内部数据为 ==> "abc1233.14true"

        System.out.println("******************************");

        //带参构造
        StringBuilder sb2 = new StringBuilder("helloworld");
        System.out.println(sb2);

        //需求2：在中间某位置插入"java"数据  ==> insert
        sb2.insert(5, "java");
        System.out.println(sb2);
    }
}
