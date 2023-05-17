package annotation;
@FunctionalInterface() // 检测接口是否为函数式接口
@Myannotation(name = "李四", age = 22)
interface Inter {
    void show();
}
@Myannotation(name = "王五")
class Fu {

    public Fu() {
    }
    @Deprecated // 标记当前方法已经过时
    public void show() {
        System.out.println("Fu show ...");
    }
}
@SuppressWarnings(value = "all")
class Zi extends Fu {
    @Myannotation(name = "小孙")

    String name;
    @Myannotation(name = "小张")
    @Override() //检测方法是否为重写方法
    public void show() {
        System.out.println("Zi show...");
    }
}
public class Demo01_JdkAnno {


public static void main(String[] args) {
    @SuppressWarnings("unused")
    int num=0;
        // @Override: 重写的注解
        // @Deprecated: 不推荐使用的注解
        // @SuppressWarnings: 压制警告的注解
    }

}
