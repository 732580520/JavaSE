
import java.util.*;

//模拟三人斗地主案例(粗糙版)
public class Landlords{
    public static void main(String[] args) {
        //1、准备牌
        //定义两个String[]，分别存储花色和点数
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //定义牌盒容器 ==> ArrayList集合，变量名pokerList
        List<Integer> pokerList = new ArrayList();
        //循环为pokerList集合进行赋值操作  ==> 先存入52张扑克牌(52个字符串)
        //外层循环控制点数  点数轮/13轮
        HashMap<Integer, String> pokerMap = new HashMap();
        //循环为pokerList集合进行赋值操作  ==> 先存入52张扑克牌(52个字符串)
        //外层循环控制点数  点数轮/13轮
        int i = 0;
        for (String num : numbers) {
            //内层循环控制花色  4种
            for (String col : colors) {
                pokerList.add(i);
                pokerMap.put(i++, col + num);
            }
        }
//        System.out.println(pokerMap);
        //组合花色和点数 --> 存入到pokerList中
        //最后单独存入大小王
        pokerMap.put(52, "小王");
        pokerList.add(52);
        pokerMap.put(53, "大王");
        pokerList.add(53);
        //2、洗牌
        Collections.shuffle(pokerList);
        //3、发牌
        //准备4个容器：3个玩家和1个底牌
        List p1 = new ArrayList();
        List p2 = new ArrayList();
        List p3 = new ArrayList();
        List secretPai = new ArrayList();
        //循环发牌
        for (int j = 0; j <= pokerList.size() - 1; j++) {
            //前三张发给secretPai容器
            if (j <= 2) {
                secretPai.add(pokerList.get(j));
            } else if (j % 3 == 0) {
                p1.add(pokerList.get(j));
            } else if (j % 3 == 1) {
                p2.add(pokerList.get(j));
            } else if (j % 3 == 2) {
                p3.add(pokerList.get(j));
            }
        }
        //4、看牌
        System.out.print("底牌 ");
        lookPai(pokerMap, secretPai);
        System.out.print("玩家一的牌 ");
        lookPai(pokerMap, p1);
        System.out.print("玩家二的牌 ");
        lookPai(pokerMap, p2);
        System.out.print("玩家三的牌 ");
        lookPai(pokerMap, p3);
    }

    //自定义方法：看牌操作
    public static void lookPai(Map pokerMap, List p) {
        Collections.sort(p);
        Iterator<Integer> it = p.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.print(pokerMap.get(key) + " ");
        }
        System.out.println();
    }
}
