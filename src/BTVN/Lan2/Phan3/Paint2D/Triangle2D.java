package BTVN.Lan2.Phan3.Paint2D;

public class Triangle2D implements IShape{
    private Point2D p1, p2, p3;

    public Triangle2D(Point2D p1, Point2D p2, Point2D p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point2D getP1() {
        return p1;
    }

    public void setP1(Point2D p1) {
        this.p1 = p1;
    }

    public Point2D getP2() {
        return p2;
    }

    public void setP2(Point2D p2) {
        this.p2 = p2;
    }

    public Point2D getP3() {
        return p3;
    }

    public void setP3(Point2D p3) {
        this.p3 = p3;
    }

    @Override
    public String toString() {
        return "Triangle2D{" + "p1=" + p1.toString() + ", p2=" + p2.toString()
                + ", p3=" + p3.toString() + '}';
    }

    @Override
    public double area() {
        return this.getBoundary().area();
    }

    @Override
    public double perimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }


    @Override
    public double distance() {
        Point2D mid = getMidPoint();
        return mid.distance();
    }

    @Override
    public void move(double dx, double dy) {
        this.p1.move(dx, dy);
        this.p2.move(dx, dy);
        this.p3.move(dx, dy);
    }

    @Override
    public void rotate(double alpha) {
        Point2D mid = getMidPoint();
        // Xoay theo mid
        p1.rotatePoint(mid, alpha);
        p2.rotatePoint(mid, alpha);
        p3.rotatePoint(mid, alpha);
    }

    @Override
    public void zoom(double ratio) {
        Point2D mid = getMidPoint();
        p1.zoomPoint(mid, ratio);
        p2.zoomPoint(mid, ratio);
        p3.zoomPoint(mid, ratio);
    }

    public Point2D getMidPoint(){
        return new Point2D((p1.getX() + p2.getX() + p3.getX()) / 3,
                (p1.getY() + p2.getY() + p3.getY()) / 3);
    }

    @Override
    public IShape getCenter() {
        return null;
    }

    @Override
    public IShape getBoundary() {
        return null;
    }
}
