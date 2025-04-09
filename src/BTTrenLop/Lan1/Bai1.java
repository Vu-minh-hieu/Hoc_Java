package BTTrenLop.Ngay1;
//ax+7y=-10
//2x-by=c
public class Bai1 {
    public static void main(String[] args){
        double a = 7.0;
        double b = 2.0;
        double c = -2;

        double dx = (-10 * b - 7 * c);
        double dy = (a * c + 20);
        double d = (-a * b - 14);

        if(d == 0){
            if(dx == 0 && dy == 0){
                System.out.println("Phuong trinh vo so nghiem");
            } else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
            double x = dx / d;
            double y = dy / d;
            System.out.println("Phuong trinh co nghiem la: " + x + " " + y);
        }
    }
}
