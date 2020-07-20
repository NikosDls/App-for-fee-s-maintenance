package testtrigono;

public class TestTrigono {

    public static void main(String[] args) {
        Point point1 = new Point(0, 0);

        Point point2 = new Point();
        point2.setX(0);
        point2.setY(4);

        Point point3 = new Point(8, 0);

        // Trigono1 is the same with trigono2 but we create them with different way
        Trigono trigono1 = new Trigono(point1, point2, point3);

        Trigono trigono2 = new Trigono();
        trigono2.setPoint1(point1);
        trigono2.setPoint2(point2);
        trigono2.setPoint3(point3);

        System.out.println("----------\nTrigono1:\n\n" + trigono1
                + "Distance from " + trigono1.getPoint1() + " and " + trigono1.getPoint2() + " is: " + trigono1.distance(trigono1.getPoint1(), trigono1.getPoint2())
                + "\nDistance from " + trigono1.getPoint1() + " and " + trigono1.getPoint3() + " is: " + trigono1.distance(trigono1.getPoint1(), trigono1.getPoint3())
                + "\nDistance from " + trigono1.getPoint2() + " and " + trigono1.getPoint3() + " is: " + trigono1.distance(trigono1.getPoint2(), trigono1.getPoint3())
                + "\n\nPerimeter from Trigono1 is:" + trigono1.perimeter() + "\n----------");

    }
}
