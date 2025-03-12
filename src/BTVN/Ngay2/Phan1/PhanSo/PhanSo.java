package BTVN.Ngay2.Phan1.PhanSo;

public class PhanSo {
    private int ts;
    private int ms;

    public PhanSo() {
        this.ts = 0;
        this.ms = 1;
    }

    public PhanSo(int ts, int ms) {
        if (ms == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0");
        } else {
            this.ts = ts;
            this.ms = ms;
            rutGon();
        }
    }

    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
        rutGon();
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        if (ms == 0) {
            System.out.println("Mau so khong the bang 0");
        } else {
            this.ms = ms;
            rutGon();
        }
    }

    @Override
    public String toString() {
        return ts + "/" + ms;
    }

    //UCLN
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    //Rut gon phan so
    private void rutGon() {
        int ucln = gcd(Math.abs(ts), Math.abs(ms));
        ts /= ucln;
        ms /= ucln;

        if (ms < 0) {
            ts = -ts;
            ms = -ms;
        }
    }

    //Tong 2 phan so
    public PhanSo tong(PhanSo ps){
        int newTs = ts * ps.ms + ms * ps.ts;
        int newMs = ms * ps.ms;
        return new PhanSo(newTs, newMs);
    }

    //Hieu 2 phan so
    public PhanSo hieu(PhanSo ps){
        int newTs = ts * ps.ms - ms * ps.ts;
        int newMs = ms * ps.ms;
        return new PhanSo(newTs, newMs);
    }

    //Tich 2 phan so
    public PhanSo tich(PhanSo ps){
        int newTs = ts * ps.ts;
        int newMs = ms * ps.ms;
        return new PhanSo(newTs, newMs);
    }

    //Thuong 2 phan so
    public PhanSo thuong(PhanSo ps){
        if (ps.ts == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có tử số bằng 0!");
        }
        int newTs = ts * ps.ms;
        int newMs = ms * ps.ts;
        return new PhanSo(newTs, newMs);
    }

    //So sanh 2 phan so
    public int compareTo(PhanSo ps) {
        if (ps == null) return -1;

        int ts1 = ts * ps.ms;
        int ts2 = ps.ts * ms;

        return ts1 > ts2 ? 1 : -1;
    }
}
