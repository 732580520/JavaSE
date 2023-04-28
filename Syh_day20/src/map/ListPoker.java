package map;

import java.util.*;

public class ListPoker {
    public static void main(String[] args) {
        /*
        步骤一：准备牌
         */
        String[] colors = {"♣", "♠", "♦", "♥"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //用于存储扑克牌的key--value映射关系
        HashMap<Integer, String> pokerMap = new HashMap<>();
        //定义起始key的值为0
        int key = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                pokerMap.put(key, colors[j] + nums[i]);
                key++;
            }
        }
        pokerMap.put(52, "小王");
        pokerMap.put(53, "大王");

        //用于存储扑克牌的key
        ArrayList<Integer> pokerList = new ArrayList<>();
        //获取扑克牌的key存入pokerList中
        Set<Integer> pokerKeys = pokerMap.keySet();
        pokerList.addAll(pokerKeys);

        /*
        步骤二：洗牌
         */
        Collections.shuffle(pokerList);

        /*
        步骤三：发牌
         */
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> secretPai = new ArrayList<>();

        for (int i = 0; i <= pokerList.size()-1 ; i++) {
            if (i < 3) {
                secretPai.add(pokerList.get(i));
            }else if (i % 3 == 0) {
                p1.add(pokerList.get(i));
            }else if (i % 3 == 1){
                p2.add(pokerList.get(i));
            }else if (i % 3 == 2){
                p3.add(pokerList.get(i));
            }
        }

        //调用看牌方法
        System.out.print("第一个人的牌：");
        lookPai(pokerMap,p1);
        System.out.println();
        System.out.print("第二个人的牌：");
        lookPai(pokerMap,p2);
        System.out.println();
        System.out.print("第三个人的牌：");
        lookPai(pokerMap,p3);
        System.out.println();
        System.out.print("底牌：");
        lookPai(pokerMap,secretPai);
    }

    /*
    步骤四：看牌
    */
    public static void lookPai(Map<Integer,String> map,List<Integer> list){
        //对list集合进行排序
        Collections.sort(list);
        //根据key获取value
        for (Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
            System.out.print(map.get(it.next()) + " ");
        }

    }
}

