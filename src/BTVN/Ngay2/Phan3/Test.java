package BTVN.Ngay2.Phan3;

import BTVN.Ngay2.Phan3.Paint2D.Circle2D;
import BTVN.Ngay2.Phan3.Paint2D.IShapeO;
import BTVN.Ngay2.Phan3.Paint2D.IShapeT;
import BTVN.Ngay2.Phan3.Paint2D.Line2D;
import BTVN.Ngay2.Phan3.Paint2D.Point2D;
import BTVN.Ngay2.Phan3.Paint2D.Triangle2D;
import BTVN.Ngay2.Phan3.Paint2D.Rectangle2D;

public class Test {
    public static void main(String[] args) {
        IShapeT[] list = {new Point2D(10, 10), new Point2D(5, 20),
                new Circle2D(new Point2D(-10, 2), 6),
                new Line2D(new Point2D(5, 8), new Point2D(3, 6)),
                new Triangle2D(new Point2D(7, 3), new Point2D(5, 1), new Point2D(2, 7)),
                new Rectangle2D(new Point2D(6, 2), 6, 3)};

        //print all shape
        for (IShapeT shape : list) {
            System.out.println(shape);
        }

        // Operation
        double S = 0;
        for (IShapeT shape : list) {
            S += ((IShapeO) shape).distance();
        }
        System.out.println("Tong khoang cac cua cac hinh: " + S);

        double sumP = 0;
        for (IShapeT shape : list) {
            sumP += ((IShapeO) shape).perimeter();
        }
        System.out.println("Tong chu vi cua cac hinh: " + sumP);

        double sumA = 0;
        for (IShapeT shape : list) {
            sumA += ((IShapeO) shape).area();
        }
        System.out.println("Tong dien tich cua cac hinh: " + sumA);

        // Transformation
        /*
        for (IShape shape : list) {
            shape.move(5, 5);
        }
        */
        /*
        for (IShape shape : list) {
            shape.rotate(Math.PI / 2);
        }
         */
        for (IShapeT shape : list) {
            shape.zoom(2);
        }

        //print all shape after transform
        for (IShapeT shape : list) {
            System.out.println(shape);
        }
    }
}
