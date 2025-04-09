package BTVN.Lan2.Phan3.Paint2D;

public class Line2D implements IShape{
    private Point2D p1, p2;

    public Line2D(Point2D p1, Point2D p2) {
        this.p1 = p1;
        this.p2 = p2;
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

    @Override
    public String toString() {
        return "Line2D{" + "p1=" + p1.toString() + ", p2=" + p2.toString() + '}';
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return this.distance();
    }

    @Override
    public double distance() {
        return this.p1.distance(this.p2);
    }

    @Override
    public void move(double dx, double dy) {
        this.p1.move(dx, dy);
        this.p2.move(dx, dy);
    }

    @Override
    public void rotate(double alpha) {
        IShape center = this.getCenter();
        // Xoay theo mid
        this.p1.rotatePoint((Point2D) center, alpha);
        this.p2.rotatePoint((Point2D) center, alpha);
    }

    @Override
    public void zoom(double ratio) {
        IShape center = this.getCenter();
        this.p1.zoomPoint((Point2D) center, ratio);
        this.p2.zoomPoint((Point2D) center, ratio);
    }

    @Override
    public IShape getCenter() {
        double dx = (p1.getX() + p2.getX()) / 2;
        double dy = (p1.getY() + p2.getY()) / 2;
        return new Point2D(dx, dy);
    }

    @Override
    public IShape getBoundary() {
        return this;
    }
}
