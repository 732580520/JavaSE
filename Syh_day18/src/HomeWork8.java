import java.util.Comparator;
import java.util.TreeSet;

public class HomeWork8 {

    public static void main(String[] args) {
        System.out.println("按照成绩和年龄排序：");
        TreeSet<Student> set = new TreeSet();
        set.add(new Student("liusan", 20, 90.0));
        set.add(new Student("lisi", 22, 90.0));
        set.add(new Student("wangwu", 20, 99.0));
        set.add(new Student("sunliu", 22, 100.0));
        for (Student student : set) {
            System.out.println(student);
        }
        System.out.println("按照姓名排序：");
        TreeSet<Student> nameSet = new TreeSet(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
//        TreeSet<Student>nameSet=new TreeSet((s1,s2)->((Student)s1).getName().compareTo(((Student)s2).getName()));
        for (Student student : set) {
            nameSet.add(student);
        }
        for (Student student : nameSet) {
            System.out.println(student);
        }
    }

    static class Student implements Comparable<Student> {
        private String name;
        private int age;
        private double score;

        public Student() {
        }

        public Student(String name, int age, double score) {
            this.name = name;
            this.age = age;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }


        @Override
        public int compareTo(Student s) {
            return s.score - score == 0 ? this.age- s.age : (int) (s.score - score);
        }

        @Override
        public String toString() {
            return "Student [" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", score=" + score +
                    ']';
        }
    }
}
