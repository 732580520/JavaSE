package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//案例：添加如下省份与城市信息到map中，并遍历显示
public class Homework02 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> city = new HashMap<>();
        //List<String> zhejiang = Arrays.asList("绍兴市", "温州市", "湖州市", "嘉兴市", "台州市", "金华市", "舟山市", "衢州市", "丽水市", "杭州市", "宁波市");
        ArrayList<String> zhejiang = new ArrayList<>();
        zhejiang.add("绍兴市");
        zhejiang.add("温州市");
        zhejiang.add("湖州市");
        zhejiang.add("嘉兴市");
        zhejiang.add("台州市");
        zhejiang.add("金华市");
        zhejiang.add("舟山市");
        zhejiang.add("衢州市");
        zhejiang.add("丽水市");
        zhejiang.add("杭州市");
        zhejiang.add("宁波市");
        city.put("浙江省", zhejiang);

        ArrayList<String> hainan = new ArrayList<>();
        hainan.add("海口市");
        hainan.add("三亚市");
        city.put("海南省", hainan);

        ArrayList<String> beijing = new ArrayList<>();
        beijing.add("北京市");
        city.put("北京市", beijing);

        print(city);
    }

    public static void print(Map<String, ArrayList<String>> map) {

        Set<String> keySet = map.keySet();
        //对省（key）进行遍历
        for (String province : keySet) {
            System.out.println(province);
            //拿key获取对应的value集合
            ArrayList<String> value = map.get(province);
            //遍历value集合
            for (int i = 0; i <= value.size()-1 ; i++) {
                System.out.println("\t"+ value.get(i));
            }

        }
    }

}
