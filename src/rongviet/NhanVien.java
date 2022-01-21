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
//public class NhanVien {
public abstract class NhanVien {

    /*yeu cau 8 can them "abstract", cac yeu cau truoc do khong can*/
    String maNV, hoTenNV, loaiNV;
    double luongNV;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTenNV, String loaiNV, double luongNV) {
        this.maNV = maNV;
        this.hoTenNV = hoTenNV;
        this.loaiNV = loaiNV;
        this.luongNV = luongNV;
    }

    //yeu cau 8
    public abstract double getThuNhap();

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTenNV() {
        return hoTenNV;
    }

    public void setHoTenNV(String hoTenNV) {
        this.hoTenNV = hoTenNV;
    }

    public String getLoaiNV() {
        return loaiNV;
    }

    public void setLoaiNV(String loaiNV) {
        this.loaiNV = loaiNV;
    }

    public double getLuongNV() {
        return luongNV;
    }

    public void setLuongNV(double luongNV) {
        this.luongNV = luongNV;
    }

    public void Nhap(Scanner s) {
        System.out.print("Nhap ma NV: ");
        this.maNV = s.nextLine();
        System.out.print("Nhap ho ten NV: ");
        this.hoTenNV = s.nextLine();
        System.out.print("Nhap luong NV: ");
        this.luongNV = s.nextDouble();
        s.nextLine();
    }

    public void Xuat() {
        //System.out.printf("Ma: %s - Ho ten: %s - Loai NV: %s - Luong: %f", maNV, hoTenNV, loaiNV, luongNV);

        //yeu cau 8
        double thueTNCC = 0;
        if (getThuNhap() >= 9000000 && getThuNhap() <= 15000000) {
            thueTNCC = getThuNhap() * 10 / 100;
        } else if (getThuNhap() > 15000000) {
            thueTNCC = getThuNhap() * 12 / 100;
        }
        System.out.printf("Ma: %s - Ho ten: %s - Loai NV: %s - Luong: %f - Thu nhap: %f - TNCC: %f", maNV, hoTenNV, loaiNV, luongNV, getThuNhap(), thueTNCC);

    }

}
