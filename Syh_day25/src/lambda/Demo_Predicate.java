package lambda;

import java.util.ArrayList;
import java.util.Collections;

public class Demo_Predicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5,7,8,9,10,11);
        list.removeIf(num->num%2==0);
        System.out.println(list);
    }
}
