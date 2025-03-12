package BTVN.Ngay2.Phan3.Paint2D;

public class Point2D implements IShapeO, IShapeT{

    private double x;
    private double y;

    public Point2D(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point2D{" + "x=" + x + ", y=" + y + '}';
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public void move(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    public void rotate(double alpha){
        return;
    }

    public void zoom(double ratio){
        return;
    }

    // Xoay 1 điểm quanh gốc (0,0)
    public void rotatePoint(Point2D mid, double alpha){
        // Tịnh tiến về gốc tọa độ
        this.x = x - mid.getX();
        this.y = y - mid.getY();
        // Xoay quanh gốc (0,0)
        double newX = x * Math.cos(alpha) - y * Math.sin(alpha);
        double newY = x * Math.sin(alpha) + y * Math.cos(alpha);
        // Trả về vị trí cũ
        this.x = newX + mid.getX();
        this.y = newY + mid.getY();
    }

    // Zoom 1 điểm theo gốc (0,0)
    public void zoomPoint(Point2D mid, double ratio){
        // Tịnh tiến về gốc tọa độ
        this.x = x - mid.getX();
        this.y = y - mid.getY();
        // Trả về vị trí cũ
        this.x = x * ratio + mid.getX();
        this.y = y * ratio + mid.getY();
    }

    public double distance(Point2D p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}
