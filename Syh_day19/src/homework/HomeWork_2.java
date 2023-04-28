package homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

/*
    双色球案例：
 */
public class HomeWork_2 {
    public static void main(String[] args) {
        Random r = new Random();

        //创建TreeSet集合，用于存储6个红球
        TreeSet<Integer> redBalls = new TreeSet<>();

        while (redBalls.size() < 6) {
            redBalls.add(r.nextInt(33) + 1);
        }

        //定义变量，用于存储1个蓝球
        int blueBall = r.nextInt(16) + 1;

        //创建ArrayList集合，用于存储6个红球和1个蓝球
        ArrayList<Integer> balls = new ArrayList<>();
        balls.addAll(redBalls);
        balls.add(blueBall);

        System.out.println("双色球所有号码：" + balls);
        System.out.print("红色号码：");

        for (Integer redBall : redBalls) {
            System.out.print(redBall + " ");
        }

        System.out.println("蓝色号码：" + blueBall);
    }
}
