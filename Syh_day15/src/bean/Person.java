package bean;

import java.util.Objects;

/*
    idea中常用快捷键：
        第二波：
                快速生成getter&setter、构造方法、重写toString、重写equals...               alt + insert -> ...
 */
public class Person {
    //属性
    private String name;
    private int age;
    private char sex;

    //getter&setter
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    //构造方法
    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                sex == person.sex &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
}





















