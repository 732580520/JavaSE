package homework;

import java.util.Scanner;

/*
    从控制台输入一个字符串，判断其是否是回文

    例如：
        abcba	-->      是回文
        hello	-->      不是回文
 */
public class HomeWork_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = input.next();

        palindrome(str);
    }

    //自定义方法：字符串内容进行反转操作
    public static String reverse(String str){
        //类型转换：String -> char[]
        char[] cs = str.toCharArray();

        //将cs数组元素进行反转操作
        for(int i = 0,j = cs.length - 1;i < j;i++,j--){
            char temp = cs[i];
            cs[i] = cs[j];
            cs[j] = temp;
        }

        //类型转换：char[] -> String
        return new String(cs);
    }

    //自定义方法：判断字符串是否是回文
    public static void palindrome(String str) {
        String newStr = reverse(str);
        System.out.println(str.equals(newStr) ? "是回文" : "不是回文");
    }
}
















