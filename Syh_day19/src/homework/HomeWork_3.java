package homework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class HomeWork_3 {
    public static void main(String[] args) {
        TreeSet<Student> stus = new TreeSet<>();
        stus.add(new Student("liusan", 20, 90.0));
        stus.add(new Student("lisio", 22, 90.0));
        stus.add(new Student("wangwu", 20, 99.0));
        stus.add(new Student("sunliu", 22, 100.0));

        System.out.println("按照成绩和年龄排序：");
        Iterator<Student> it = stus.iterator();
        while (it.hasNext()) {
            Student stu = it.next();
            System.out.println(stu);
        }

        System.out.println("按照姓名排序：");

        TreeSet<Student> stus2 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        stus2.addAll(stus);

        for (Student s : stus2) {
            System.out.println(s);
        }
    }
}
