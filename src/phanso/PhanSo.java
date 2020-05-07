/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

import java.util.*;

/**
 *
 * @author tilangtu
 */
public class PhanSo {

    int tu, mau = 1;
    int UCLN, t;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t1, m1;
        int t2, m2;
        System.out.print("Tử số 1 : ");
        t1 = input.nextInt();
        System.out.print("Mẫu số 1 : ");
        m1 = input.nextInt();
        System.out.print("Tử số 2 : ");
        t2 = input.nextInt();
        System.out.print("Mẫu số 2: ");
        m2 = input.nextInt();

        PhanSo ps = new PhanSo();
        ps.tu = t1;
        ps.mau = m1;
        PhanSo ps1 = new PhanSo();
        ps1.tu = t2;
        ps1.mau = m2;

        PhanSo kq = ps.phepCong(ps1);
        PhanSo kq1 = ps.phepTru(ps1);
        PhanSo kq2 = ps.phepNhan(ps1);
        PhanSo kq3 = ps.phepChia(ps1);
    }

    int UCLN(int t, int m) {// hàm tìm kiếm UC lớn 
        if (m == 0)// nếu mẫu bằng ko ( qui luật ko thể chia cho 0 ; nên trả lại kq luôn ko cần làm tiếp )
        {
            return t;
        }
        return UCLN(m, t % m);// nếu mẫu khác 0 thì ta có t= m , m = t chia dư m cho đến khi m =0 thì thoát chương trình
    }

    PhanSo phepCong(PhanSo x) {
        int tuMoi = (tu * x.mau + x.tu * mau);
        int mauMoi = x.mau * mau;
        //System.out.println("Chưa rút gọn  : " + tuMoi + "/" + mauMoi);
        PhanSo pSmoi = new PhanSo();

        //toi gian
        UCLN = UCLN(tuMoi, mauMoi);

        pSmoi.tu = tuMoi / UCLN;
        pSmoi.mau = mauMoi / UCLN;
        System.out.print("Cộng 2 phan so : ");
        if (pSmoi.mau == 1) {
            System.out.println(pSmoi.tu);
        } else {
            System.out.println(pSmoi.tu + "/" + pSmoi.mau);
        }
        return pSmoi;
    }

    PhanSo phepTru(PhanSo x) {
        int tuMoi = (tu * x.mau - x.tu * mau);
        int mauMoi = x.mau * mau;
        //System.out.println("Chưa rút gọn  : " + tuMoi + "/" + mauMoi);
        PhanSo pSmoi = new PhanSo();

        //toi gian
        UCLN = UCLN(tuMoi, mauMoi);

        pSmoi.tu = tuMoi / UCLN;
        pSmoi.mau = mauMoi / UCLN;
        System.out.print("Trừ 2 phan so : ");
        if (pSmoi.mau == 1) {
            System.out.println(pSmoi.tu);
        } else {
            System.out.println(pSmoi.tu + "/" + pSmoi.mau);
        }
        return pSmoi;
    }

    PhanSo phepNhan(PhanSo x) {
        int tuMoi = (tu * x.tu);
        int mauMoi = x.mau * mau;
        //System.out.println("Chưa rút gọn  : " + tuMoi + "/" + mauMoi);
        PhanSo pSmoi = new PhanSo();

        //toi gian
        UCLN = UCLN(tuMoi, mauMoi);

        pSmoi.tu = tuMoi / UCLN;
        pSmoi.mau = mauMoi / UCLN;
        System.out.print("Nhân 2 phân số : ");
        if (pSmoi.mau == 1) {
            System.out.println(pSmoi.tu);
        } else {
            System.out.println(pSmoi.tu + "/" + pSmoi.mau);
        }
        return pSmoi;
    }

    PhanSo phepChia(PhanSo x) {
        int tuMoi = (tu * x.mau);
        int mauMoi = x.tu * mau;
        //System.out.println("Chưa rút gọn  : " + tuMoi + "/" + mauMoi);
        PhanSo pSmoi = new PhanSo();

        //toi gian
        UCLN = UCLN(tuMoi, mauMoi);

        pSmoi.tu = tuMoi / UCLN;
        pSmoi.mau = mauMoi / UCLN;
        System.out.print("Chia 2 phân số ");
        if (pSmoi.mau == 1) {
            System.out.println(pSmoi.tu);
        } else {
            System.out.println(pSmoi.tu + "/" + pSmoi.mau);
        }
        return pSmoi;
    }
}
