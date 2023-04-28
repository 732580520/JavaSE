import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class HomeWork1 {
    public static void main(String[] args) {
        char[] c=new char[26+26+10];
        randomCode(c);
    }
    public static void randomCode(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i<10) {
                arr[i] = (char) (i + 48);
            }else if (i<10+26) {
                arr[i] = (char) (i + 65-10);
            }else {
                arr[i] = (char) (i + 97-10-26);
            }
        }
        ArrayList list = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            String str="";
            for(int j=0;j<6;j++){
                int index = random.nextInt(arr.length);
                str+=arr[index];
            }
            list.add(str);
        }
        Iterator iterator=list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("随机验证码："+next);
        }
    }
}
