package test;

import java.util.Random;
import java.util.Scanner;

/*
    idea中常用快捷键：
        第一波：
                快速生成main方法                                     psvm -> 回车

                快速生成打印语句                                     sout -> 回车

                另起一行                                             shift + 回车

                复制代码                                             ctrl + d

                删除代码                                             ctrl + y

                移动代码
                    向上移动                                         ctrl + shift + ↑
                    向下移动                                         ctrl + shift + ↓

                注释：
                    单行注释(添加、取消)                             ctrl + /
                    多行注释(添加、取消)                             ctrl + shift + /

                补全代码右侧所有的标签符号                           ctrl + shift + 回车

                格式化代码                                           ctrl + alt + l

                查看源代码                                           shift + shift -> 输入类名 -> ...


                【重要快捷键】：
                    eclipse中的ctrl + 1        相当于                 idea中的alt + 回车
                    eclipse中的alt + /         相当于                 idea中的ctrl + alt + 空格
 */
public class TestShortCut {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello idea");
        }

        int num = 3;
        System.out.println(num++);

        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int num2 = r.nextInt();
    }
}
