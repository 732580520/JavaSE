package homework;
/*
    统计大串中小串出现的次数
    String max = "laoguo is a good man,laoguo is a nice man,laoguo ia a handsome man";
    String min = "laoguo";
 */
public class HomeWork_5 {
    public static void main(String[] args) {
        String max = "laoguo is a good man,laoguo is a nice man,laoguo ia a handsome man";
        String min = "laoguo";

        int count = getCount(max, min);
        System.out.println("大串中小串出现的次数为：" + count);
    }

    //自定义方法：统计大串中小串出现的次数
    public static int getCount(String big,String small) {
        int count = 0;      //用于记录出现的次数

        int index;
        while ((index = big.indexOf(small)) != -1) {
            //说明找到了，算一个
            count++;
            big = big.substring(index + small.length());
        }

        return count;
    }
}
