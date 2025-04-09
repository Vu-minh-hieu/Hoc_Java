package BTVN.Ngay2.Phan3.Paint2D;

public class Rectangle2D implements IShape{
    private Point2D[] Points;
    private double height;
    private double width;

    public Rectangle2D(Point2D p1, double h, double w) {
        this.Points[0] = p1;
        this.Points[1] = new Point2D(Points[0].getX(), Points[0].getY() + w);
        this.Points[2] = new Point2D(Points[0].getX() + h, Points[0].getY());
        this.Points[3] = new Point2D(Points[0].getX() + h, Points[0].getY() + w);
        this.height = h;
        this.width = w;
    }

    public Point2D getP1() {
        return Points[0];
    }

    public void setP1(Point2D p1) {
        this.Points[0] = p1;
    }

    public Point2D getP2() {
        return Points[1];
    }

    public Point2D getP3() {
        return Points[2];
    }

    public Point2D getP4() {
        return Points[3];
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
        this.Points[2] = new Point2D(Points[0].getX() + h, Points[0].getY());
        this.Points[3] = new Point2D(Points[0].getX() + h, Points[0].getY() + this.width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        this.width = w;
        this.Points[1] = new Point2D(Points[0].getX(), Points[0].getY() + w);
        this.Points[3] = new Point2D(Points[0].getX() + this.height, Points[0].getY() + w);
    }

    @Override
    public String toString() {
        return "Rectangle2D{" + "p1=" + Points[0].toString() + ", p2=" + Points[1].toString()
                + ", p3=" + Points[3].toString() + ", p4=" + Points[3].toString() + '}';
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
        IShape center = getCenter();
        return ((Point2D) center).distance();
    }

    @Override
    public void move(double dx, double dy) {
        for (Point2D p : Points){
            p.move(dx, dy);
        }
    }

    @Override
    public void rotate(double alpha) {
        IShape center = getCenter();
        // Xoay theo mid
        for (Point2D p : Points){
            p.rotatePoint((Point2D) center, alpha);
        }
    }

    @Override
    public void zoom(double ratio) {
        IShape center = getCenter();
        for (Point2D p : Points){
            p.zoomPoint((Point2D) center, ratio);
        }
    }

    @Override
    public IShape getCenter(){
        double dx = (Points[0].getX() + Points[3].getX()) / 2;
        double dy = (Points[0].getY() + Points[3].getY()) / 2;
        return new Point2D(dx, dy);
    }

    @Override
    public IShape getBoundary() {
        return this;
    }
}

