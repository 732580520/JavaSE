package generic;
/*
    自定义泛型接口
 */
interface Inter<T>{
    public abstract T show(T t);
}

//类实现接口的过程中明确泛型形参的具体类型
class InterImpl implements Inter<String>{
    @Override
    public String show(String s) {
        return s;
    }
}

//类实现接口的过程中没有明确泛型形参的具体类型
class InterImpl2<E> implements Inter<E> {
    @Override
    public E show(E e) {
        return e;
    }
}

public class TestGeneric_5 {
    public static void main(String[] args) {
        //在实例化对象的过程中明确泛型形参的具体类型
        InterImpl2<Integer> ii = new InterImpl2<>();
        ii.show(123);

        //在实例化对象的过程中去除了<>的定义 ==> 称为：泛型的擦除操作
        //理解：所有的泛型形参类型位置都同步为Object类型
        InterImpl2 ii2 = new InterImpl2();
        ii2.show("abc");
    }
}















