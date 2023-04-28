import java.util.LinkedHashSet;
import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入一串字母:");
        String s= scanner.next();
        System.out.println("str="+s);
        char[] c=s.toCharArray();
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < c.length; i++) {
            linkedHashSet.add(c[i]);
        }
        System.out.println("去重后：");
        for (Object o : linkedHashSet) {
            System.out.print(o);
        }

    }
}
