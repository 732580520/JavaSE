
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class HomeWork7 {
    public static void main(String[] args) {
        Random random = new Random();
        TreeSet<Integer> treeSet = new TreeSet();
        while (treeSet.size()<6){
            treeSet.add(random.nextInt(33) + 1);
        }
        ArrayList<Integer> list = new ArrayList();
        list.addAll(treeSet);
        list.add(random.nextInt(16) + 1);
        System.out.println("双色球所有号码：" + list);
        System.out.print("红色号码：");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("蓝色号码：" + list.get(list.size() - 1));
    }
}
