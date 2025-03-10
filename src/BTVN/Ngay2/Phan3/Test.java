package BTVN.Ngay2.Phan3;

import BTVN.Ngay2.Phan3.Paint2D.Circle2D;
import BTVN.Ngay2.Phan3.Paint2D.IShape;
import BTVN.Ngay2.Phan3.Paint2D.Point2D;

public class Test {
    public static void main(String[] args) {
        IShape[] list = {new Point2D(10, 10), new Point2D(5, 20),
                new Circle2D(new Point2D(-10, 2), 6)};

        // Operation
        double S = 0;
        for (IShape shape : list) {
            S += shape.distance();
        }
        System.out.println(S);

        // Transformation
        for (IShape shape : list) {
            shape.move(5, 5);
        }
        //print all shape
        for (IShape shape : list) {
            System.out.println(shape);
        }
    }
}
