package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo02_Comparator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 589, 95, 598, 1961, 8496, 1626, 1);
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        Collections.sort(list,(Integer o1, Integer o2 )->{return o2-o1;});
        Collections.sort(list,(o1,o2)->o2-o1);
        System.out.println(list);
        String[] s={"nih","jidah","wadua","dd","iahfa"};
//        Arrays.sort(s, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        });
//        Arrays.sort(s, (String O1,String O2)->{return O2.length()-O1.length();});
        Arrays.sort(s, (O1,O2)->O2.length()-O1.length());
        System.out.println(Arrays.toString(s));
    }
}
