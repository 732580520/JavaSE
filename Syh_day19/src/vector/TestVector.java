package vector;

import com.bjpn.homework.bean.Student;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
    演示Vector类的独有方法 ==> 都已经被弃用
 */
public class TestVector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("abc");
        v.addElement(123);
        v.addElement(3.14);
        v.addElement(true);
        v.addElement(null);
        v.addElement(new Student("李雷", 20));

        System.out.println("jdk1.2版本以前遍历方式：");
        Enumeration enums = v.elements();
        while (enums.hasMoreElements()) {
            System.out.println(enums.nextElement());
        }

        System.out.println();
        System.out.println("**********************************");
        System.out.println();

        System.out.println("jdk1.2版本及以后遍历方式：");

        Iterator it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
