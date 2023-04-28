import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        String name;
        int age;
        while (true){
            System.out.print("选择（1、继续录入；0、结束退出）：");
            int input=scanner.nextInt();
            if (input==1){
                System.out.print("姓名：");
                name=scanner.next();
                System.out.print("年龄：");
                age=scanner.nextInt();
                list.add(new Student(name, age));
            }else if(input==0){
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student);
        }

    }
}
