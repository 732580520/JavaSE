package homework;

import java.util.LinkedHashSet;
import java.util.Scanner;

//对于字符串内容进行去重，维护顺序
public class HomeWork_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一串字母：");
        String str = input.next();
        System.out.println("str=" + str);

        //创建LinkedHashSet集合容器
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0;i <= str.length() - 1;i++) {
            set.add(str.charAt(i));
        }

        //定义字符串
        String newStr = "";

        //遍历set集合
        for (Character c : set) {
            newStr += c;
        }

        System.out.println("去重后：" + newStr);
    }
}
