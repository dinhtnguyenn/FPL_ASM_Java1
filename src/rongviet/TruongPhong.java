/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rongviet;

import java.util.Scanner;

/**
 *
 * @author DinhNguyen
 */
public class TruongPhong extends NhanVien {

    private double luongTrachNhiem;

    public TruongPhong(String maNV, String hoTenNV, double luongNV, double luongTrachNhiem) {
        super(maNV, hoTenNV, "Truong Phong", luongNV);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public double getLuongTrachNhien() {
        return luongTrachNhiem;
    }

    public TruongPhong() {
        super(null, null, "Truong Phong", 0);
    }

    public void setLuongTrachNhien(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public void Nhap(Scanner s) {
        super.Nhap(s);
        System.out.print("Nhap luong trach nhiem: ");
        this.luongTrachNhiem = s.nextDouble();
        s.nextLine();
    }

    public void Xuat() {
        super.Xuat();
        System.out.printf("- Luong trach nhiem: %f", luongTrachNhiem);
    }

    //yeu cau 8
    @Override
    public double getThuNhap() {
        return luongNV + luongTrachNhiem;
    }
}
