package BTVN.Lan2.Phan1;

import BTVN.Lan2.Phan1.PhanSo.PhanSo;
import BTVN.Lan2.Phan1.PhanSo.TapHopPS;

public class Test {
    public static void main (String[] arg){
        PhanSo ps1 = new PhanSo(3, 4);
        PhanSo ps2 = new PhanSo(5, 6);
        PhanSo ps3 = new PhanSo(6, 3);
        PhanSo ps4 = new PhanSo(7, 6);
        PhanSo ps5 = new PhanSo(5, 1);
        try {
            System.out.println("PhanSo 1: " + ps1);
            System.out.println("PhanSo 2: " + ps2);
            System.out.println("Tong cua ps1 va ps2: " + ps1.tong(ps2));
            System.out.println("Hieu cua ps1 - ps2: " + ps1.hieu(ps2));
            System.out.println("Tich cua ps1 va ps2: " + ps1.tich(ps2));
            System.out.println("Thuong cua ps1/ps2: " + ps1.thuong(ps2));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        TapHopPS THPS = new TapHopPS();
        THPS.add(ps1);
        THPS.add(ps2);
        THPS.add(ps3);
        THPS.add(ps4);
        THPS.add(ps5);
        System.out.println("Phan so lon nhat trong tap phan so: " + THPS.getMax());
        System.out.println("Tong cac phan so: " + THPS.sum());
        System.out.println("So phan so khong phai so nguyen: " + THPS.phanSoKhongNguyen());
    }
}
