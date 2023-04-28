package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*现在有两个 ArrayList 集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）依次进行以下若干操作步骤：
        1. 第一个队伍只要名字为3个字的成员姓名；
        2. 第一个队伍筛选之后只要前3个人；
        3. 第二个队伍只要姓张的成员姓名；
        4. 第二个队伍筛选之后不要前2个人；
        5. 将两个队伍合并为一个队伍；
        6. 根据姓名创建 Person 对象；
        7. 打印整个队伍的Person对象信息。*/
public class Test {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        Collections.addAll(one,"迪丽热巴","宋远桥","苏星河","老子","庄子","孙子","洪七公");
        List lengthList=new ArrayList();
        for (String name : one) {
            if (name.length()==3){
                lengthList.add(name);
            }
        }
        List limitList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            limitList.add(limitList.get(i));
        }
        List<String> two = new ArrayList<>();
        Collections.addAll(two,"古力娜扎","张无忌","张三丰","赵丽颖","张二狗","张天爱","张三");
        List zhangList = new ArrayList();
        for (String name: two) {
            if (name.startsWith("张")){
                zhangList.add(name);
            }
        }
        List skipList = new ArrayList();
        for (int i = 2; i < zhangList.size(); i++) {
            skipList.add(zhangList.get(i));
        }
        List<String> totalList = new ArrayList();
        totalList.addAll(limitList);
        totalList.addAll(skipList);
        for (String name: totalList) {
            System.out.println(new Person(name));
        }



    }
}
