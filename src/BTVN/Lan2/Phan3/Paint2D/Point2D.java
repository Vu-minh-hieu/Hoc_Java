package BTVN.Ngay2.Phan3.Paint2D;

public class Point2D implements IShape{

    private double x;
    private double y;

    public Point2D(double x, double y) {
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

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    @Override
    public void move(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void rotate(double alpha){
        return;
    }

    @Override
    public void zoom(double ratio){
        return;
    }

    @Override
    public Point2D getCenter(){
        return this;
    }

    @Override
    public IShape getBoundary() {
        return this;
    }

    // Add-ons functions
    // Xoay 1 điểm quanh gốc (0,0)
    public void rotatePoint(Point2D center, double alpha){
        // Tịnh tiến về gốc tọa độ
        double dx = x - center.x;
        double dy = y - center.y;
        // Xoay quanh gốc (0,0)
        double newX = dx * Math.cos(alpha) - dy * Math.sin(alpha);
        double newY = dx * Math.sin(alpha) + dy * Math.cos(alpha);
        // Trả về vị trí cũ
        this.x = newX + center.x;
        this.y = newY + center.y;
    }

    // Zoom 1 điểm theo gốc (0,0)
    public void zoomPoint(Point2D center, double ratio){
        // Tịnh tiến về gốc tọa độ
        double dx = this.x - center.x;
        double dy = this.y - center.y;
        // Trả về vị trí cũ
        this.x = dx * ratio + center.x;
        this.y = dy * ratio + center.y;
    }

    public double distance(Point2D p) {
        double dx = Math.pow(this.x - p.x, 2);
        double dy = Math.pow(this.y - p.y, 2);
        return Math.sqrt(dx + dy);
    }
}
