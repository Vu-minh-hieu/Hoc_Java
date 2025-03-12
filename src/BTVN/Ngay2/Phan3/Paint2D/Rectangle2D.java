package BTVN.Ngay2.Phan3.Paint2D;

public class Rectangle2D implements IShapeO, IShapeT{
    private Point2D p1, p2, p3, p4;
    private double height;
    private double width;

    public Rectangle2D(Point2D p1, double h, double w) {
        super();
        this.p1 = p1;
        this.p2 = new Point2D(p1.getX(), p1.getY() + w);
        this.p3 = new Point2D(p1.getX() + h, p1.getY());
        this.p4 = new Point2D(p1.getX() + h, p1.getY() + w);
        this.height = h;
        this.width = w;
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

    public Point2D getP3() {
        return p3;
    }

    public Point2D getP4() {
        return p4;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
        this.p3 = new Point2D(p1.getX() + h, p1.getY());
        this.p4 = new Point2D(p1.getX() + h, p1.getY() + this.width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        this.width = w;
        this.p2 = new Point2D(p1.getX(), p1.getY() + w);
        this.p4 = new Point2D(p1.getX() + this.height, p1.getY() + w);
    }

    @Override
    public String toString() {
        return "Rectangle2D{" + "p1=" + p1.toString() + ", p2=" + p2.toString()
                + ", p3=" + p3.toString() + ", p4=" + p4.toString() + '}';
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return (height + width) * 2;
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
        this.p4.move(dx, dy);
    }

    @Override
    public void rotate(double alpha) {
        Point2D mid = getMidPoint();
        // Xoay theo mid
        p1.rotatePoint(mid, alpha);
        p2.rotatePoint(mid, alpha);
        p3.rotatePoint(mid, alpha);
        p4.rotatePoint(mid, alpha);
    }

    @Override
    public void zoom(double ratio) {
        Point2D mid = getMidPoint();
        p1.zoomPoint(mid, ratio);
        p2.zoomPoint(mid, ratio);
        p3.zoomPoint(mid, ratio);
        p4.zoomPoint(mid, ratio);
    }

    public Point2D getMidPoint(){
        return new Point2D((p1.getX() + p4.getX()) / 2, (p1.getY() + p4.getY()) / 2);
    }
}

