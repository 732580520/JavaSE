package set;

import java.util.Comparator;

//半径比较器类
public class RadiusComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        return (int) (c2.getRadius() - c1.getRadius());
    }
}
