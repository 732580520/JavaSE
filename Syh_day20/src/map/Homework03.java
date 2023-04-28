package map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
案例：
（1）从键盘输入一个年份，输出该年的世界杯冠军是哪支球队。如果该年没有举办世界杯，则输出：没有举办世界杯。 
（2）从键盘输入一支球队的名字，输出该球队夺冠的年份列表。 例如，读入“巴西”，应当输出 1958 1962 1970 1994 2002 读入“荷兰”，应当输出 没有获得过世界杯
 */
public class Homework03 {
    public static void main(String[] args) {
        HashMap<Integer, String> worldcup = new HashMap<>();
        worldcup.put(1930, "乌拉圭");
        worldcup.put(1934, "意大利");
        worldcup.put(1938, "意大利");
        worldcup.put(1950, "乌拉圭");
        worldcup.put(1954, "西德");
        worldcup.put(1958, "巴西");
        worldcup.put(1962, "巴西");
        worldcup.put(1966, "英格兰");
        worldcup.put(1970, "巴西");
        worldcup.put(1974, "西德");
        worldcup.put(1978, "阿根廷");
        worldcup.put(1982, "意大利");
        worldcup.put(1986, "阿根廷");
        worldcup.put(1990, "西德");
        worldcup.put(1994, "巴西");
        worldcup.put(1998, "法国");
        worldcup.put(2002, "巴西");
        worldcup.put(2006, "意大利");
        worldcup.put(2010, "西班牙");
        worldcup.put(2014, "德国");
        worldcup.put(2018, "法国");

        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个年份：");
        int year = input.nextInt();

        //获取worldcup的key集合
        Set<Integer> keySet = worldcup.keySet();
        //判断，如果key不包含year
        if (!keySet.contains(year)) {
            System.out.println("没有举办世界杯。");
        } else {
            //遍历key
            for (Integer worldYear : keySet) {
                if (worldYear == year) {
                    System.out.println(worldYear + "年，获得世界杯冠军的是：" + worldcup.get(worldYear));
                }

            }
        }

        System.out.print("请输入一个国家的名称：");
        String country = input.next();

        //获取worldcup的value集合，如果不包含country
        if (!worldcup.values().contains(country)) {
            System.out.println(country + "没有获得过世界杯");
        } else {
            System.out.println("该球队在如下年份获得过冠军：");
            //遍历key
            for (Integer worldYear : keySet) {
                //判断country与哪一年的key相同，则输出对应的key
                if (worldcup.get(worldYear).equals(country)) {
                    System.out.println(worldYear);
                }
            }
        }
    }
}
