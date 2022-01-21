/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rongviet;

/**
 *
 * @author DinhNguyen
 */
public class NhanVienHanhChinh extends NhanVien{
    
    public NhanVienHanhChinh(String maNV, String hoTenNV, double luongNV) {
        super(maNV, hoTenNV, "Hanh Chinh", luongNV);
    }

    public NhanVienHanhChinh() {
        super(null, null, "Hanh Chinh", 0);
    }

    //yeu cau 8
    @Override
    public double getThuNhap() {
        return luongNV;
    }
    
}
