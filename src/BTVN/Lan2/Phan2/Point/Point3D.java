package BTVN.Lan2.Phan2.Point;

public class Point3D extends Point2D{
    private double z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" + "x=" + getX() + ", y=" + getY() + ", z=" + z + "}";
    }

    public double distance(Point3D p) {
        return Math.sqrt(Math.pow(this.getX() - p.getX(), 2) +
                Math.pow(this.getY() - p.getY(), 2) +
                Math.pow(this.z - p.z, 2));
    }

    public Point3D doiXung(){
        return new Point3D(-getX(), -getY(), -this.z);
    }

    public void move(double dx, double dy, double dz) {
        super.move(dx, dy);
        this.z += dz;
    }
}

