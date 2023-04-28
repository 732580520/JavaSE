package generic;

import java.util.ArrayList;

/*
    泛型的作用/好处：
        1).将问题暴露的时机提前：从运行阶段 -> 编译阶段
        2).类型进行约束了，运行阶段避免定义强转的代码，也不会出现类型转换异常
        3).数据更加的安全 --> 安全性提高

    注意事项：
        1).jdk1.7版本以后等号右侧<>内部的实参类型可以省略
        2).泛型实参类型只能定义引用类型，不可以是基本类型
        3).等号左右两侧<>内的泛型实参类型不支持多态性，只能是相同类型
 */
public class TestGeneric_1 {
    public static void main(String[] args) {
        test1();
    }

    public static void test3() {
        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<int> list2 = new ArrayList<int>();
//        List<Object> list3 = new ArrayList<Integer>();
    }

    public static void test2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("python");
        list.add("mysql");
        list.add("html");
        list.add("javascript");
//        list.add(123);

        for (String s : list) {
            System.out.println(s.length());
        }
    }

    public static void test1() {
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("python");
        list.add("mysql");
        list.add("html");
        list.add("javascript");
        //java.lang.ClassCastException
//        list.add(123);

        for (Object o : list) {
            //由于o属于Object类型，我们需要调用的是String类中独有的length方法，面临：Object -> String
            String str = (String) o;
            System.out.println(str.length());
        }

//        int[] arr = new int[3];
//        arr[0] = 100;
//        arr[1] = 200;
//        arr[2] = "abc";
    }
}
