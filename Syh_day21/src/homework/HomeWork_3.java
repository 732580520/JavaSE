package homework;

import java.util.*;

public class HomeWork_3 {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();
        map.put("浙江省", Arrays.asList("绍兴市", "温州市", "湖州市", "嘉兴市", "台州市", "金华市", "舟山市", "衢州市", "丽水市", "杭州市", "宁波市"));
        map.put("海南省", Arrays.asList("海口市", "三亚市"));
        map.put("北京市", Arrays.asList("北京市"));

        Set<Map.Entry<String, List<String>>> entries = map.entrySet();
        for (Map.Entry<String, List<String>> entry : entries) {
            String key = entry.getKey();
            System.out.println(key);
            List<String> value = entry.getValue();
            for (String s : value) {
                System.out.println("\t" + s);
            }
        }
    }
}
