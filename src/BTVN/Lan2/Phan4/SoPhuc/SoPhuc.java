package BTVN.Lan2.Phan4.SoPhuc;

public class SoPhuc {
    private double a;
    private double b;

    public SoPhuc() {
        this.a = 1;
        this.b = -1;
    }

    public SoPhuc(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return a + " + (" + b + "i)";
    }

    public SoPhuc cong(SoPhuc p){
        return new SoPhuc(this.a + p.a, this.b + p.b);
    }
    public double modulus(){
        return Math.sqrt(a * a + b * b);
    }

}
