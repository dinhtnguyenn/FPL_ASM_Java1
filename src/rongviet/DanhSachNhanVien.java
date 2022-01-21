/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rongviet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DinhNguyen
 */
public class DanhSachNhanVien {

    private ArrayList<NhanVien> list = new ArrayList<>();

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        list.clear();
        do {
            System.out.print("Nhap loai nhan vien (Nhap rong de thoat, 1: hanh chinh - 2: truong phong - 3: tiep thi): ");
            String sLoai = scanner.nextLine();

            if (sLoai == null || sLoai.equals("")) {
                break;
            }

            int loai = Integer.parseInt(sLoai);

            switch (loai) {
                case 1:
                    NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                    
                    nvhc.Nhap(scanner);
                    list.add(nvhc);
                    break;
                case 2:
                    TruongPhong tp = new TruongPhong();
                    tp.Nhap(scanner);
                    list.add(tp);
                    break;
                case 3:
                    NhanVienTiepThi nvtt = new NhanVienTiepThi();
                    nvtt.Nhap(scanner);
                    list.add(nvtt);
                    break;
            }
        } while (true);
    }

    public void Xuat() {
        System.out.println("Danh sach nhan vien");
        for (NhanVien nv : list) {
            if (nv instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh) nv).Xuat();
            } else if (nv instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi) nv).Xuat();
            } else if (nv instanceof TruongPhong) {
                ((TruongPhong) nv).Xuat();
            }
            System.out.println("\n");
        }
    }

    //yeu cau 3: Tìm và hiển thị nhân viên theo mã nhập từ bàn phím
    public void TimNVTheoMa(Scanner s) {
        System.out.print("Nhap ma can tim: ");
        String ma = s.nextLine();
        NhanVien nvFound = null;
        for (NhanVien nv : list) {
            if (nv.getMaNV().equalsIgnoreCase(ma)) {
                nvFound = nv;
                break;
            }
        }

        if (nvFound != null) {
            System.out.println("Thong tin nhan vien tim thay: ");
            nvFound.Xuat();
        } else {
            System.out.println("Khong tim thay nhan vien co ma " + ma);
        }
    }

    //yeu cau 4: Xóa nhân viên theo mã nhập từ bàn phím.
    public void XoaNVTheoMa(Scanner s) {
        System.out.println("Nhap ma NV can xoa: ");
        String ma = s.nextLine();
        NhanVien nvFound = null;
        for (NhanVien nv : list) {
            if (nv.getMaNV().equalsIgnoreCase(ma)) {
                nvFound = nv;
                break;
            }
        }

        if (nvFound != null) {
            System.out.println("Nhan vien da duoc xoa");
            list.remove(nvFound);
        } else {
            System.out.println("Khong tim thay nhan vien can xoa co ma " + ma);
        }
    }

    //yeu cau 5: Cập nhật thông tin nhân viên theo mã nhập từ bàn phím
    public void CapNhatThongTinNVTheoMa(Scanner s) {
        System.out.println("Cap nhat thong tin nhan vien thoe ma");
        System.out.print("Nhap ma nhan vien can cap nhat thong tin: ");
        String ma = s.nextLine();
        NhanVien nvFound = null;
        for (NhanVien nv : list) {
            if (nv.getMaNV().equalsIgnoreCase(ma)) {
                nvFound = nv;
                break;
            }
        }

        if (nvFound != null) {
            System.out.println("Nhap thong tin cap nhat cho nhan vien");
            if (nvFound instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh) nvFound).Nhap(s); //phuong thuc cap nhat giong nhu phuong thuc Nhap
            } else if (nvFound instanceof TruongPhong) {
                ((TruongPhong) nvFound).Nhap(s);
            } else if (nvFound instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi) nvFound).Nhap(s);
            }
        } else {
            System.out.println("Khong tim thay nhan vien can cap nhat thong tin co ma " + ma);
        }
    }

    //Y6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.
    public void TimNVTheoKhoangLuong(Scanner s) {
        System.out.println("Tim nhan vien theo khoang luong");

        System.out.print("Nhap khoang luong thap nhat: ");
        double min = s.nextDouble();

        System.out.print("Nhap khoang luong cao nhat: ");
        double max = s.nextDouble();

        boolean flag = false;
        NhanVien nvFound = null;
        for (NhanVien nv : list) {
            if (min <= nv.getLuongNV() && nv.getLuongNV() <= max) {
                nv.Xuat();
                System.out.println();
                flag = true;
            }
        }

        if (flag == false) {
            System.out.println("Khong tim thay nhan vien co khoang luonng can tim");
        }
    }

    //Y7. Sắp xếp nhân viên theo họ và tên.
    public void SapXepTheoTen() {
        Collections.sort(list, (a, b) -> a.getHoTenNV().compareTo(b.getHoTenNV()));
    }

    //Y8. Sắp xếp nhân viên theo thu nhập.
    public void SapXepTheoThuNhap() {
        Collections.sort(list, (a, b) -> (int) (a.getThuNhap() - b.getThuNhap()));
    }
    
    //Y9. Xuất 5 nhân viên có thu nhập cao nhất
    public void Top5TheoThuNhap() {
        //sap xep giam dan (b-a)
        Collections.sort(list, (a, b) -> (int) (b.getThuNhap() - a.getThuNhap()));
        System.out.println("Danh sach top 5 thu nhap");
        for (int i = 0; i< 5 && i < list.size(); i++) {
            list.get(i).Xuat();
        }
    }
}
