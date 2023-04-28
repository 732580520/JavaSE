import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/*
    需求：
        定义Collection集合用于存储多个字符串数据，内部有重复的元素，
        将重复的元素去除，将去重后的元素内容依旧存储在原集合容器中(维护添加顺序)，遍历打印元素内容看效果

    重构上述的需求 ==> 使用LinkedHashSet集合
 */
public class Exer {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("aaa");
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ccc");
        coll.add("bbb");
        System.out.println(coll);

        //创建LinkedHashSet集合容器
        LinkedHashSet set = new LinkedHashSet(coll);

        //清空coll集合元素
        coll.clear();

        //将set集合中的元素全部加入到coll集合容器中
        coll.addAll(set);
        System.out.println(coll);
    }
}
