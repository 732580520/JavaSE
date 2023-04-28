package generic;
/*
    自定义泛型方法：
 */
class Demo2<A>{
    public void func(A a) {
        System.out.println(a);
    }

    public <B> void method(B b) {
        System.out.println(b);
    }
}

public class TestGeneric_4 {
    public static void main(String[] args) {
        //实例化对象的过程中，就明确了泛型形参A的具体类型，但是B类型仍然不明确
        Demo2<String> d = new Demo2<>();
        d.func("hello");

        //在调用method方法传入实参数据的一刹那，B类型的具体类型就明确了
        d.method(123);

        System.out.println("****************************");

        String[] arr = {"aaa", "bbb", "ccc", "ddd"};
        Integer[] arr2 = {123, 456, 789};

        printArray(arr);
        printArray(arr2);
    }

    //自定义方法     遍历数组元素
    public static <T> void printArray(T[] arr) {        //Object[] arr
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

//    public static void printArray(String[] arr) {
//        for (String s : arr) {
//            System.out.print(s + " ");
//        }
//        System.out.println();
//    }
//
//    public static void printArray(Integer[] arr) {
//        for (Integer i : arr) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
}
