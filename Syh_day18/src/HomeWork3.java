import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList list = new ArrayList();
        for (int i = 1; i <= 10; ) {
            int num = random.nextInt(50) + 1;
            if (!list.contains(num)) {
                list.add(num);
                i++;
            }
        }
        Collections.sort(list);
        System.out.println("乐透号码已经生成，游戏开始");
        ArrayList list1 = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; ) {
            System.out.println("请输入第" + i + "个数字[1-50]：");
            int num = scanner.nextInt();
            if ((num < 1 || num > 50) || list1.contains(num)) System.out.println("输入的内容不合理，请重新输入");
            else {
                list1.add(num);
                i++;
            }
        }
        Collections.sort(list1);
        int num = 0;
        for (int i = 0; i < 10; i++) {
            if (list.contains(list1.get(i))) {
                num++;
            }
        }
        System.out.println("您输入的号码为：" + list1.toString());
        System.out.println("乐透号码为：" + list.toString());
        System.out.println("猜中了:" + num + "个数字");
    }
}


