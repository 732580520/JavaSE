package homework;

import java.util.Scanner;

/*
    模拟登录，登陆过程中只能尝试3次。从控制台输入用户名和密码，
    如果用户名密码正确的话，
    提示登陆成功，
    否则提示登陆失败，并提示还有几次。
    （用户名是"admin"，密码是"123456"）

    【提示】：
        用户名和密码的内容比较，应该用equals方法
 */
public class HomeWork_1 {
    public static void main(String[] args) {
        login();
    }

    //自定义方法：模拟用户登录操作
    public static void login() {
        //定义正确的用户名和密码
        String username = "admin";      //用于记录正确的用户名
        String password = "123456";     //用于记录正确的密码

        Scanner input = new Scanner(System.in);

        //循环3次
        for (int i = 2;i >= 0;i--) {
            System.out.println("请输入用户名：");
            String uname = input.next();
            System.out.println("请输入密码：");
            String pwd = input.next();
            //判断
            if (username.equals(uname) && password.equals(pwd)) {
                System.out.println("登录成功！");
                return;
            } else {
                if (i != 0) {
                    System.out.println("用户名或者密码有误，还有" + i + "次尝试机会...");
                } else {
                    System.out.println("尝试次数过多，请稍后再试！");
                }
            }
        }

        //...
    }
}
