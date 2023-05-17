package linkedlist;

import set.Student;

import java.util.LinkedList;

/*
    演示List接口主要实现类之：LinkedList
    独有方法：和首尾相关
 */
public class TestLinkedList {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        LinkedList list = new LinkedList();
        list.add("abc");
        list.add(123);
        list.add(3.14);
        list.add(true);
        list.add(new Student("韩梅梅", 19));

        System.out.println(list);

        /*
            增操作：
                void addFirst(E e)：将指定元素插入此列表的开头。
                void addLast(E e)：将指定元素添加到此列表的结尾。
         */
        list.addFirst(666);
        list.addLast(999);

        System.out.println(list);

        /*
            获取操作：
                E getFirst()：返回此列表的第一个元素。
                E getLast()：返回此列表的最后一个元素。
         */
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        /*
            删除操作：
                 E removeFirst()：移除并返回此列表的第一个元素。
                 E removeLast()：移除并返回此列表的最后一个元素。
         */
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

    }
}
