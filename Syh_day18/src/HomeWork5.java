import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class HomeWork5 {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            list.add(String.valueOf((char)(random.nextInt(26) + 97)));
        }
        System.out.println(list);
        System.out.println("a:"+listTest(list, "a"));
        System.out.println("b:"+listTest(list, "b"));
        System.out.println("c:"+listTest(list, "c"));
        System.out.println("x:"+listTest(list, "x"));
    }
    public static int listTest(Collection<String> list, String s){
        int count = 0;
        while (list.contains(s)){
            if (list.contains(s)){
                count++;
                list.remove(s);
            }
        }
        return count;
    }
}
