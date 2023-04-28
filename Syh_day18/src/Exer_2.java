import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Exer_2 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(123);
        coll.add(123);
        coll.add(456);
        coll.add("你好");
        Collection coll2 = new ArrayList();
        Iterator it = coll.iterator();
        for (Object obj : coll) {
            if (!coll2.contains(obj)) {
                coll2.add(obj);
            }
        }
        coll.clear();
        coll.addAll(coll2);
        Iterator it3 = coll.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            System.out.println(next);
        }
        for (Iterator it2 = coll.iterator(); it2.hasNext(); ) {
            System.out.println(it2.next());
        }
    }
}
