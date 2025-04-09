package BTTrenLop.Lan1;

public class Bai4 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,15};
        int S = 0;

        for (int elem = 0; elem < a.length; elem++){
            if(a[elem] % 3 == 0){
                S += a[elem];
            }
        }
        System.out.println(S);
    }
}
