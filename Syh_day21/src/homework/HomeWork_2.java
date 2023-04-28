package homework;

import java.util.*;

public class HomeWork_2 {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();
        ArrayList<String> zxy = new ArrayList<>();
        zxy.add("《一路上有你》");
        zxy.add("《吻别》");
        zxy.add("《一千个伤心的理由》");
        map.put("张学友", zxy);

        ArrayList<String> wf = new ArrayList<>();
        wf.add("《红豆》");
        wf.add("《传奇》");
        wf.add("《容易受伤的女人》");
        map.put("王菲", wf);

        Set<Map.Entry<String, List<String>>> entries = map.entrySet();
        for (Map.Entry<String, List<String>> entry : entries) {
            //得到每一个entry，打印看效果
            System.out.println(entry);
        }
    }
}
