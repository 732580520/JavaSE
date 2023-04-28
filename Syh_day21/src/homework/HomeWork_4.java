package homework;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//世界杯案例
public class HomeWork_4 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1930, "乌拉圭");
        map.put(1934, "意大利");
        map.put(1938, "意大利");
        map.put(1950, "乌拉圭");
        map.put(1954, "西德");
        map.put(1958, "巴西");
        map.put(1962, "巴西");
        map.put(1966, "英格兰");
        map.put(1970, "巴西");
        map.put(1974, "西德");
        map.put(1978, "阿根廷");
        map.put(1982, "意大利");
        map.put(1986, "阿根廷");
        map.put(1990, "西德");
        map.put(1994, "巴西");
        map.put(1998, "法国");
        map.put(2002, "巴西");
        map.put(2006, "意大利");
        map.put(2010, "西班牙");
        map.put(2014, "德国");
        map.put(2018, "法国");
        map.put(2022, "阿根廷");

        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个年份：");
        int year = input.nextInt();
        if (map.containsKey(year)) {
            String value = map.get(year);
            System.out.println(year + "年，获取世界杯冠军的是：" + value);
        } else {
            System.out.println(year + "年没有举办过世界杯！");
        }

        System.out.print("请输入一个国家名称：");
        String country = input.next();
        if (map.containsValue(country)) {
            System.out.println("该国球队在如下年份获得过冠军：");
            Set<Integer> keys = map.keySet();
            for (Integer key : keys) {
                String value = map.get(key);
                if (value.equals(country)) {
                    System.out.println(key);
                }
            }
        } else {
            System.out.println(country + "没有夺得过世界杯冠军！！");
        }
    }
}
