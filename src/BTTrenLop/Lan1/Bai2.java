package BTTrenLop.Lan1;

public class Bai2 {
    public static void main(String[] args){
        double n = 3;
        double[] a = new double[20];

        a[0] = 1;
        for(int i = 1; i <= n + 1; i++){
            a[i] = a[i - 1] * i;
        }

        double S = 0;
        for(int i = 1; i < n + 1; i++){
            S += (i + Math.sqrt(i)) / (i + a[i + 1]);
        }

        System.out.println("Tong S = " + S);
    }
}
