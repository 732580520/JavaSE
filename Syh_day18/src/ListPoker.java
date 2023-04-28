import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPoker {
    public static void main(String[] args) {
        /*
        步骤一：准备牌
         */
        String[] colors = {"梅花","黑桃","方块","红桃"};
        String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        List list = new ArrayList();
        //也可采用for...each的方式
        /*for (String num : nums) {
            for (String color : colors) {
                list.add(color + num);
            }
        }*/
        for (int i = 0; i <= nums.length-1; i++) {
            for (int j = 0; j <= colors.length-1 ; j++) {
                list.add(colors[j] + nums[i]);
            }
        }
        list.add("小王");
        list.add("大王");
        /*
        步骤二：洗牌
         */
        Collections.shuffle(list);
        /*
        步骤三：发牌
         */
        ArrayList p1 = new ArrayList();
        ArrayList p2 = new ArrayList();
        ArrayList p3 = new ArrayList();
        ArrayList secretPai = new ArrayList();

        secretPai.add(list.get(0));
        secretPai.add(list.get(1));
        secretPai.add(list.get(2));

        for (int i = 3; i <= list.size()-1 ; i++) {
            //发给第一个人
            if (i % 3 == 0) {
                p1.add(list.get(i));
                //发给第二个人
            }else if (i % 3 == 1){
                p2.add(list.get(i));
                //发给第三个人
            }else if (i % 3 == 2){
                p3.add(list.get(i));
            }
        }

        //调用看牌方法
        System.out.print("第一个人的牌：");
        lookPai(p1);
        System.out.print("第二个人的牌：");
        lookPai(p2);
        System.out.print("第三个人的牌：");
        lookPai(p3);
        System.out.print("底牌：");
        lookPai(secretPai);

    }

    /*
    步骤四：看牌
    */
    public static void lookPai(List list){
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
