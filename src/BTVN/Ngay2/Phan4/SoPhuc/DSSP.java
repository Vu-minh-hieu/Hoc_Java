package BTVN.Ngay2.Phan4.SoPhuc;

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

}
