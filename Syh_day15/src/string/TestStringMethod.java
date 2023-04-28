package string;
/*
    字符串的常用方法：
 */
public class TestStringMethod {
    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        /*
            是否包含
              boolean contains(CharSequence s)：当且仅当此字符串包含指定的 char 值序列时，返回 true。
         */
        String content = "老郭棒棒哒啊！";

        boolean result = content.contains("棒棒哒啊");
        System.out.println(result);
    }

    public static void test2() {
        /*
            全部替换
                String replaceAll(String regex, String replacement)：使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
         */
        String content = "中国啊中国，我为你骄傲。中国啊中国，我为你自豪。";
        String newContent = content.replaceAll("中国", "老郭");
        System.out.println(newContent);
        System.out.println(content);
    }
}
