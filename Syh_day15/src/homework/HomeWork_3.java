package homework;
/*
    把一个字符串的首字母转成大写，其余为小写!
    String s = “woaiLAOGUOailaoguo”;
 */
public class HomeWork_3 {
    public static void main(String[] args) {
        String s = "woaiLAOGUOailaoguo";

        String s2 = initCap(s);
        System.out.println(s2);
    }

    //自定义方法：把一个字符串的首字母转成大写，其余为小写
    public static String initCap(String str){
        //方式一：
//        char c = str.charAt(0);                    //'w'
//        String first = c + "";                     //"w"
//        first = first.toUpperCase();               //"W"

        //方式二：
        String first = str.substring(0, 1).toUpperCase();       //方法的连缀调用      "W"

        String second = str.substring(1).toLowerCase();         //方法的连缀调用      "ailaoguoailaoguo"

        return first.concat(second);
    }
}
