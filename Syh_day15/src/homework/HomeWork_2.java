package homework;
/*
    * 需求：统计一个字符串中大写字母字符，
        小写字母字符，数字字符出现的次数,其他字符出现的次数。
    * String s = "ABCDEabcd123456!@#$%^";
    提示：使用ascii码
 */
public class HomeWork_2 {
    public static void main(String[] args) {
        String s = "ABCDEabcd123456!@#$%^";

        printCounts(s);
    }

    //自定义方法：统计打印各种类型字符的次数
    public static void printCounts(String str){
        //计数的思想 ==> 定义变量
        int big = 0;        //用于记录大写英文字符出现的次数
        int small = 0;      //用于记录大写英文字符出现的次数
        int number = 0;     //用于记录大写英文字符出现的次数
        int other = 0;      //用于记录大写英文字符出现的次数

        for(int i = 0;i <= str.length() - 1;i++){
            char c = str.charAt(i);
            //判断
            if (c >= 48 && c <= 57) {
                //属于数字字符，算一个
                number++;
            } else if (c >= 65 && c <= 90) {
                //属于大写英文字符，算一个
                big++;
            } else if (c >= 97 && c <= 122) {
                //属于小写英文字符，算一个
                small++;
            } else {
                //属于其它字符，算一个
                other++;
            }
        }

        System.out.println("大写英文字符出现的次数为：" + big);
        System.out.println("小写英文字符出现的次数为：" + small);
        System.out.println("数字字符出现的次数为：" + number);
        System.out.println("其它字符出现的次数为：" + other);
    }
}
