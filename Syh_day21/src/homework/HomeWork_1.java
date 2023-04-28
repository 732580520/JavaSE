package homework;

import java.util.*;

//斗地主案例(优化版)
public class HomeWork_1 {
    public static void main(String[] args) {
        //1、准备牌
        //定义两个String[]，分别存储花色和点数
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //创建两个集合容器(pokerMap、pokerList)
        HashMap<Integer, String> pokerMap = new HashMap<>();
        ArrayList<Integer> pokerList = new ArrayList<>();

        int i = 0;
        //外层循环控制点数
        for (String num : numbers) {
            //内层循环控制花色
            for (String col : colors) {
                //组合花色和点数 ==> 存入到pokerMap的值的位置
                pokerMap.put(i, col + num);
                pokerList.add(i);
                i++;
            }
        }

        //最后存入大小王
        pokerMap.put(52, "小王");
        pokerList.add(52);
        pokerMap.put(53, "大王");
        pokerList.add(53);

        //2、洗牌
        Collections.shuffle(pokerList);

        //3、发牌
        //准备4个容器：3个玩家和1个底牌
        List<Integer> p1 = new ArrayList<>();
        List<Integer> p2 = new ArrayList<>();
        List<Integer> p3 = new ArrayList<>();
        List<Integer> secretPai = new ArrayList<>();

        //循环发牌：
        for (int j = 0;j <= pokerList.size() - 1;j++) {
            //前三张发给secretPai容器
            if (j <= 2) {
                secretPai.add(pokerList.get(j));
            } else if (j % 3 == 0) {
                p1.add(pokerList.get(j));
            } else if (j % 3 == 1) {
                p2.add(pokerList.get(j));
            } else {
                p3.add(pokerList.get(j));
            }
        }

        //4、看牌
        lookPai(secretPai, pokerMap);
        lookPai(p1, pokerMap);
        lookPai(p2, pokerMap);
        lookPai(p3, pokerMap);
    }

    //自定义方法：看牌
    public static void lookPai(List<Integer> list, Map<Integer,String> map) {
        //将list排序
        Collections.sort(list);

        for (Integer key : list) {
            System.out.print(map.get(key) + " ");
        }
        System.out.println();
    }
}
