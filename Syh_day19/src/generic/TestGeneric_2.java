package generic;
/*
    自定义泛型类：
 */
class Demo<T>{
    T num;

    public void func(T num){
        this.num = num;
    }
}

public class TestGeneric_2 {
    public static void main(String[] args) {
        //创建Demo对象的过程中，明确泛型形参的具体类型 --> 定义泛型实参类型
        Demo<String> d = new Demo<>();
        d.func("abc");

        Demo<Integer> d2 = new Demo<>();
        d2.func(123);

    }
}
