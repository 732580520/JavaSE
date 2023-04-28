import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HomeWork4 {
    public static void main(String[] args) {
        Random random = new Random();
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100)+1);
        }
        System.out.println("10个随机值："+list);
        Collections.sort(list);
        System.out.println(list);
        List maxList = new ArrayList();
        for (int i = 1; i <= 3; i++) {
            maxList.add(list.get(list.size()-1));
            list.remove(list.get(list.size()-1));
        }
        System.out.println("前3个最大的："+maxList.toString());
        System.out.println("删除后："+list.toString());
    }
}
