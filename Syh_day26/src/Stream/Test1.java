package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/*现在有两个 ArrayList 集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）依次进行以下若干操作步骤：
        1. 第一个队伍只要名字为3个字的成员姓名；
        2. 第一个队伍筛选之后只要前3个人；Test
        3. 第二个队伍只要姓张的成员姓名；
            4. 第二个队伍筛选之后不要前2个人；
        5. 将两个队伍合并为一个队伍；
        6. 根据姓名创建 Person 对象；
        7. 打印整个队伍的Person对象信息。*/
public class Test1 {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        Collections.addAll(one, "迪丽热巴", "宋远桥", "苏星河", "老子", "庄子", "孙子", "洪七公");
        List<String> two = new ArrayList<>();
        Collections.addAll(two, "古力娜扎", "张无忌", "张三丰", "赵丽颖", "张二狗", "张天爱", "张三");
        Stream<String> limit = one.stream().filter(name -> name.length() == 3).limit(3);
        Stream<String> skip = two.stream().filter(name -> name.startsWith("张")).skip(2);
        Stream.concat(limit, skip).map(name->new Person(name)).forEach(p-> System.out.println(p));
    }
}
