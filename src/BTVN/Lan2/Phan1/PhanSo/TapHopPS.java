package BTVN.Lan2.Phan1.PhanSo;

import java.util.ArrayList;
import java.util.List;

public class TapHopPS {
    List<PhanSo> dsPS;

    public TapHopPS() {
        dsPS = new ArrayList<>();
    }

    public TapHopPS(List<PhanSo> dsPS) {
        this.dsPS = dsPS;
    }

    public List<PhanSo> getDsPS() {
        return dsPS;
    }

    public void setDsPS(List<PhanSo> dsPS) {
        this.dsPS = dsPS;
    }

    //them vao list
    public void add(PhanSo ps){
        dsPS.add(ps);
    }

    //lay max ps tu list
    public PhanSo getMax() {
        if (dsPS.isEmpty()) {
            return null;
        }

        PhanSo max = dsPS.get(0);
        for (PhanSo ps : dsPS) {
            if (ps.compareTo(max) > 0) {
                max = ps;
            }
        }
        return max;
    }

    //tinh tong cac ps
    public PhanSo sum() {
        if (dsPS.isEmpty()) {
            return new PhanSo(0, 1);
        }

        PhanSo sum = new PhanSo();
        for (PhanSo ps : dsPS) {
            sum = sum.tong(ps);
        }
        return sum;
    }

    //tra ve so ps ko phai so nguyen
    public int phanSoKhongNguyen() {
        int cnt = 0;
        for (PhanSo ps : dsPS) {
            if (ps.getMs() != 1) {
                cnt++;
            }
        }
        return cnt;
    }
}
