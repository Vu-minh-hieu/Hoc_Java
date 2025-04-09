package BTVN.Ngay2.Phan4;

import BTVN.Ngay2.Phan4.SoPhuc.SoPhuc;
import BTVN.Ngay2.Phan4.SoPhuc.DSSP;

public class Test {
    public static void main (String[] arg){
        SoPhuc p1 = new SoPhuc(3, 4);
        SoPhuc p2 = new SoPhuc(5, 6);
        SoPhuc p3 = new SoPhuc(6, 0);
        SoPhuc p4 = new SoPhuc(7, 6);
        SoPhuc p5 = new SoPhuc(5, 0);

        DSSP dssp = new DSSP();
        dssp.add(p1);
        dssp.add(p2);
        dssp.add(p3);
        dssp.add(p4);
        dssp.add(p5);
        System.out.println("Danh sach so phuc: ");
        for (SoPhuc p : dssp.getDs()){
            System.out.println(p);
        }
        System.out.println("Trung binh cong cac so phuc: " + dssp.TBC());
        System.out.println("So phuc co modulus lon nhat la: " + dssp.getMaxModul());
        System.out.println("So so phuc khong co phan ao la: " + dssp.demSPKoCoPhanAo());
    }
}
