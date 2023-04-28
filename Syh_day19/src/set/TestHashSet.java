package set;

import java.util.HashSet;

/*
    HashSet类：

    特点：完全无序，且不可以重复

    判断元素是否重复的标准：
        先计算得到对象的hashCode值：
            如果hashCode值不一致，则直接存入
            如果hashCode只是一致的，继续比较equals：
                如果equals比较结果为false，则都存入
                如果equals比较结果为true，舍弃后者

        理解：先hashCode，再可能equals

    注意：
        1).如果Set集合(HashSet、LinkedHashSet)内部需要存入的是我们自定义类的对象，则在设计类的过程中一定要保证去重写HashCode和equals方法
        2).元素无序性的体现：
               将元素往哈希表中进行存储，不是从头往尾部逐个的存储下来，而是根据计算出现的散列表位置跳跃式的进行存储


 */
public class TestHashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();
//        set.add(123);
//        set.add(123);
//        set.add(true);
//        set.add(true);
//        set.add("abc");
//        set.add("abc");
//        set.add("bac");
//        set.add("cba");
//        set.add("bac");

        set.add(new Student("李雷", 20));
        set.add(new Student("李雷", 20));

        System.out.println(set);

//        System.out.println(Integer.valueOf(123).hashCode());
//        System.out.println(Boolean.valueOf(true).hashCode());
//        System.out.println("abc".hashCode());
//        System.out.println("bac".hashCode());
//        System.out.println("cba".hashCode());

        System.out.println(new Student("李雷", 20).hashCode());
        System.out.println(new Student("李雷", 20).hashCode());
    }
}
