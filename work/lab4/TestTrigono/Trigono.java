package testtrigono;

public class Trigono {

    private Point point1,
            point2,
            point3;

    public Trigono() {
    }

    public Trigono(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPoint3() {
        return point3;
    }

    public double distance(Point pStart, Point pEnd) {
        return Math.sqrt(Math.pow((pStart.getX() - pEnd.getX()), 2) + Math.pow((pStart.getY() - pEnd.getY()), 2));
    }

    public double perimeter() {
        return distance(point1, point2) + distance(point1, point3) + distance(point2, point3);
    }

    public String toString() {
        return "1st Point: " + point1.toString() + "\n"
                + "2nd Point: " + point2.toString() + "\n"
                + "3rd Point: " + point3.toString() + "\n\n";
    }
}
