package set;

import java.util.LinkedHashSet;

/*
    LinkedHashSet类：

    特点：保证元素不可重复的前提下，维护了一层添加顺序

    判断元素是否重复的标准：
        先计算得到对象的hashCode值：
            如果hashCode值不一致，则直接存入
            如果hashCode只是一致的，继续比较equals：
                如果equals比较结果为false，则都存入
                如果equals比较结果为true，舍弃后者

        理解：先hashCode，再可能equals
 */
public class TestLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add("JAVASE");
        set.add("JAVASE");
        set.add("JAVAEE");
        set.add("JAVAEE");
        set.add("JAVAME");
        set.add("JAVAME");
        set.add("javase");
        set.add("javase");

        System.out.println(set);
    }
}
