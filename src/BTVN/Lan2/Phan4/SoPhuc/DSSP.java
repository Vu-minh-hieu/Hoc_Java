package BTVN.Lan2.Phan4.SoPhuc;

import java.util.ArrayList;
import java.util.List;

public class DSSP {
    private List<SoPhuc> ds;

    public DSSP() {
        ds = new ArrayList<>();
    }

    public DSSP(List<SoPhuc> ds) {
        this.ds = ds;
    }

    public List<SoPhuc> getDs() {
        return ds;
    }

    public void setDs(List<SoPhuc> ds) {
        this.ds = ds;
    }

    //them vao list
    public void add(SoPhuc p){
        ds.add(p);
    }

    //tinh trung binh cong so phuc
    public SoPhuc TBC(){
        double sumThuc = 0;
        double sumAo = 0;
        int n = ds.size();
        for (SoPhuc p : ds) {
            sumThuc += p.getA();
            sumAo += p.getB();
        }
        return new SoPhuc(sumThuc / n, sumAo / n);
    }

    //lay so phuc co module lon nhat tu list
    public SoPhuc getMaxModul() {
        if (ds.isEmpty()) {
            return null;
        }

        SoPhuc max = ds.get(0);
        for (SoPhuc p : ds) {
            if (p.modulus() > max.modulus()) {
                max = p;
            }
        }
        return max;
    }

    //dem so so phuc ko co phan ao
    public int demSPKoCoPhanAo() {
        int cnt = 0;
        for (SoPhuc p : ds) {
            if (p.getB() == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
