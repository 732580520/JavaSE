package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        test7();
    }

    public static void test7() {
        //使用匿名内部类的方式实现操作
        TreeSet set = new TreeSet(new Comparator<Circle>() {
            @Override
            public int compare(Circle c1, Circle c2) {
                return (int) (c2.getRadius() - c1.getRadius());
            }
        });

        set.add(new Circle(4.0));
        set.add(new Circle(6.0));
        set.add(new Circle(1.0));
        set.add(new Circle(5.0));
        set.add(new Circle(2.0));
        set.add(new Circle(3.0));

        System.out.println(set);
    }

    public static void test6() {
        //自定义类Circle对象存入到TreeSet容器中 ==> 使用带参构造创建TreeSet容器对象
        TreeSet set = new TreeSet(new RadiusComparator());
        set.add(new Circle(4.0));
        set.add(new Circle(6.0));
        set.add(new Circle(1.0));
        set.add(new Circle(5.0));
        set.add(new Circle(2.0));
        set.add(new Circle(3.0));
        System.out.println(set);
    }

    public static void test5() {
        //自定义类Employee对象存入到TreeSet容器中 ==> 类实现Comparable接口
        TreeSet set = new TreeSet();
        set.add(new Employee(4, "赵六", 30, 18000.0));
        set.add(new Employee(1, "张三", 22, 6000.0));
        set.add(new Employee(5, "田七", 36, 26000.0));
        set.add(new Employee(2, "李四", 25, 8800.0));
        set.add(new Employee(3, "王五", 33, 21000.0));

        System.out.println(set);

    }

    public static void test4() {
        /*
            注意事项：
                1).TreeSet集合内部只能存储相同类型的对象
                2).使用空参构造方法创建TreeSet集合容器，则存储的对象类型都必须实现了Comparable接口
                3).使用带参构造方法创建TreeSet集合容器，参数位置传入一个Comparator接口的实现类对象即可

         */
        TreeSet set = new TreeSet();
        set.add(789);
        set.add(123);
        set.add(123);
        set.add(456);

        //java.lang.ClassCastException
//        set.add(3.14);
//        set.add(new Object());
//        set.add(new Date());

        System.out.println(set);
    }

    public static void test3() {
        /*
            TreeSet：
                特点：无序性，保证元素不可重复的前提下，维护了一层比较关系
                判断元素是否重复的标准：
                    如果两个对象是相等的，则认为它们是重复的

         */
        TreeSet set = new TreeSet();
        set.add("zhangsan");
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        System.out.println(set);
    }

    public static void test2() {
        /*
            LinkedHashSet：
                特点：无序性，保证元素不可重复的前提下，维护了一层添加顺序
                判断是否重复的依据：hashCode、equals
         */
        LinkedHashSet set = new LinkedHashSet();
        set.add("张三");
        set.add("张三");
        set.add("李四");
        set.add("王五");
        System.out.println(set);
    }

    public static void test1() {
        /*
            HashSet：
                特点：完全无序，且不可以重复
                判断是否重复的依据：hashCode、equals
         */
        HashSet set = new HashSet();
        set.add("张三");
        set.add("张三");
        set.add("李四");
        set.add("王五");
        System.out.println(set);
    }
}
