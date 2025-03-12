package BTVN.Ngay2.Phan3.Paint2D;

public class Line2D implements IShapeO, IShapeT{
    private Point2D p1, p2;

    public Line2D(Point2D p1, Point2D p2) {
        super();
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
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    //Công thức khoảng cách từ điểm (x0, y0) đến đường thẳng Ax + By + C = 0:
    // d = |A.x0 + B.y0 + C| / sqrt(A^2 + B^2)
    @Override
    public double distance() {
        double[] eq = getEquation();
        double A = eq[0], B = eq[1], C = eq[2];
        return Math.abs(C) / Math.sqrt(A * A + B * B);
    }

    @Override
    public void move(double dx, double dy) {
        this.p1.move(dx, dy);
        this.p2.move(dx, dy);
    }

    @Override
    public void rotate(double alpha) {
        Point2D mid = getMidPoint();
        // Xoay theo mid
        p1.rotatePoint(mid, alpha);
        p2.rotatePoint(mid, alpha);
    }

    @Override
    public void zoom(double ratio) {
        Point2D mid = getMidPoint();
        p1.zoomPoint(mid, ratio);
        p2.zoomPoint(mid, ratio);
    }

    // Lấy phương trình đường thẳng Ax + By + C = 0 từ p1(x1, y1), p2(x2, y2)
    //Bước 1: vectơ chỉ phương của đường thẳng = (x1 - x2; y1 - y2)
    //Bước 2: vectơ pháp tuyến của đường thẳng = (y2 - y1; x1 - x2)
    //Bước 3: Phương trình đường thẳng : (y2 - y1).(x - x1) + (x1 - x2).(y - y1) = 0
    //-> (y2 - y1).x + (x1 - x2).y - ((y2 - y1).x1 + (x1 - x2).y1) = 0
    public double[] getEquation() {
        double A = p2.getY() - p1.getY();
        double B = p1.getX() - p2.getX();
        double C = -(A * p1.getX() + B * p1.getY());
        return new double[]{A, B, C};
    }

    public Point2D getMidPoint(){
        return new Point2D((p1.getX() + p2.getX()) / 2, (p1.getY() + p2.getY()) / 2);
    }
}
