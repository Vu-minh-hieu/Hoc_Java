package BTTrenLop.Lan1;

public class Bai3 {
    public static void main(String[] args){
        int[] a = new int[100];
        int m = 38;

        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i <= 20; i++){
            a[i] = a[i - 1] + a[i - 2];
        }
        if(m == 0 || m == 1){
            System.out.println("Loi");
        }else{
            for(int i = 2; i <= 20; i++){
                if(m >= a[i-1] && m < a[i]){
                    System.out.println("n = " + (i - 1) );
                }
            }
        }
    }
}
