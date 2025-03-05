package BTVN.Ngay2.Phan3;

import BTVN.Ngay2.Phan3.Paint2D.Circle2D;
import BTVN.Ngay2.Phan3.Paint2D.IShapeT;
import BTVN.Ngay2.Phan3.Paint2D.Point2D;

public class Test {
    public static void main(String[] args) {
        IShapeT[] list = {new Point2D(10, 10), new Point2D(5, 20),
                new Circle2D(new Point2D(-10, 2), 6)};

        // Operation
        double S = 0;
        for (IShapeT shape : list) {
            S += shape.distance();
        }
        System.out.println(S);

        // Transformation
        for (IShapeT shape : list) {
            shape.move(5, 5);
        }
    }
}
