public class haha {
    public static void main(String[] args) {
        String s="https://www.chem17.com/st120694/product_33228145.html";
        //把字符串中的"st"后字符串"/product"之前的第一串数字提取出来，并且把"_"后字符串".html"之前第一串数字提取出来，并把这两者存入String类型的infoss数组中，并输出第零号和第一号下标的内容
        String[] infoss = s.split("st|/product|_|.html");
        System.out.println(infoss[0]);
        System.out.println(infoss[1]);

    }
}
