package enum_;

public class Demo01_Score {
    public static void main(String[] args) {
        Score a = Score.getA();
        System.out.println("a = " + a);
        a.print();
        a.printScore();
        Score a1 = Score.getA();
        System.out.println("a1 = " + a1);
        Score b = Score.getB();
        System.out.println("b = " + b);
        b.print();
        b.printScore();
        Score c = Score.getC();
        System.out.println("c = " + c);
        c.print();
        c.printScore();
        Score d = Score.getD();
        System.out.println("d = " + d);
        d.print();
        d.printScore();
        Score e = Score.getE();
        System.out.println("e = " + e);
        e.print();
        e.printScore();
    }
}
