package BTVN.Ngay2.Phan2;

import BTVN.Ngay2.Phan2.Point.Point2D;
import BTVN.Ngay2.Phan2.Point.Point3D;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Point2D> points = new ArrayList<>();
        points.add(new Point2D(1, 2));
        points.add(new Point2D(3, 4));
        points.add(new Point3D(5, 6, 7));
        points.add(new Point3D(-2, -3, -4));
        // tong kc cac diem 2d
        double sum2D = 0;
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                if (!(points.get(i) instanceof Point3D) && !(points.get(j) instanceof Point3D)) {
                    sum2D += points.get(i).distance(points.get(j));
                }
            }
        }
        // tong kc cac diem 3d
        double sum3D = 0;
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                if (points.get(i) instanceof Point3D && points.get(j) instanceof Point3D) {
                    sum3D += ((Point3D) points.get(i)).distance((Point3D) points.get(j));
                }
            }
        }
        // in tong
        System.out.println("Tong khoang cach giua cac diem 2D: " + sum2D);
        System.out.println("Tong khoang cach giua cac diem 3D: " + sum3D);
        // them vao DS cac diem doi xung
        int n = points.size();
        for (int i = 0; i < n; i++) {
            points.add(points.get(i).doiXung());
        }
        // in DS sau khi them
        System.out.println("Danh sach sau khi them cac diem doi xung:");
        for (Point2D point : points) {
            System.out.println(point);
        }
    }
}
