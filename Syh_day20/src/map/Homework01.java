package map;

import java.util.*;

//案例：添加你喜欢的歌手以及你喜欢他唱过的歌曲
public class Homework01 {
    public static void main(String[] args) {
        HashMap<String, List<String>> singer = new HashMap<>();

        ArrayList<String> zhangxueyou = new ArrayList<>();
        zhangxueyou.add("《一路上有你》");
        zhangxueyou.add("《吻别》");
        zhangxueyou.add("《一千个伤心的理由》");
        singer.put("张学友", zhangxueyou);

        ArrayList<String> wangfei = new ArrayList<>();
        wangfei.add("《红豆》");
        wangfei.add("《传奇》");
        wangfei.add("《容易受伤的女人》");
        singer.put("王菲", wangfei);

        Set<Map.Entry<String, List<String>>> entries = singer.entrySet();
        for (Map.Entry<String, List<String>> entry : entries) {
            System.out.println(entry);
            //System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
