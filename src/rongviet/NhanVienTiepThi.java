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
public class NhanVienTiepThi extends NhanVien {
    
    private double doanhSo, hoaHong;
    
    public NhanVienTiepThi(String maNV, String hoTenNV, double luongNV, double doanhSo, double hoaHong)  {
        super(maNV, hoTenNV, "Tiep Thi", luongNV);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }
    
    public NhanVienTiepThi() {
        super(null, null, "Tiep Thi", 0);
    }
    
    public double getDoanhSo() {
        return doanhSo;
    }
    
    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }
    
    public double getHoaHong() {
        return hoaHong;
    }
    
    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }
    
    public void Nhap(Scanner s) {
        super.Nhap(s);
        System.out.print("Nhap doanh so: ");
        this.doanhSo = s.nextDouble();
        System.out.print("Nhap hoa hong: ");
        this.hoaHong = s.nextDouble();
        s.nextLine();
    }
    
    public  void Xuat(){
        super.Xuat();
        System.out.printf(" - Doanh so: %f - Hoa hong: %f", doanhSo, hoaHong);
    }

    //yeu cau 8
    @Override
    public double getThuNhap() {
        return luongNV + doanhSo*hoaHong/100; 
    }
}
