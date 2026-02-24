import java.awt.Point;

public class nonPrimitive {
    public static void main(String[] args) {
        System.out.println("Hello boy!!");
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
