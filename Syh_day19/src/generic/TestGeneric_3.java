package generic;
/*
    需求：
        定义Student类：属性：String name、score(未知类型)
        如果是语文老师描述学员成绩，效果："优秀"、"良好"、...
        如果是数学老师描述学员成绩，效果：98、70、66...
        如果是英文老师描述学员成绩，效果：'A'、'E'...
 */
class Student<E>{
    private String name;
    private E score;

    public Student(String name, E score) {
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public E getScore() {
        return score;
    }

    public void setScore(E score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

public class TestGeneric_3 {
    public static void main(String[] args) {
        Student<String> s1 = new Student<>("张三", "优秀");
        Student<Integer> s2 = new Student<>("李四", 88);
        Student<Character> s3 = new Student<>("王五", 'B');
    }
}

















