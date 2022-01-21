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
public class RongVietMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
        Scanner s = new Scanner(System.in);

        while (true) {
            int chon = 0;
            System.out.println("------------------");
            System.out.println("Chuong trinh quan ly Nhan Vien");
            System.out.println("1. Nhập danh sách nhân viên từ bàn phím.");
            System.out.println("2. Xuất danh sách nhân viên ra màn hình.");
            System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
            System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.");
            System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
            System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
            System.out.println("7. Sắp xếp nhân viên theo họ và tên.");
            System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
            System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất.");
            System.out.println("0. Thoát chương trình");
            System.out.print("Mời bạn nhập lựa chọn: ");
            chon = s.nextInt();
            s.nextLine();

            if (chon == 0) {
                System.exit(0);
            }

            switch (chon) {
                case 1:
                    dsnv.Nhap();
                    break;
                case 2:
                    dsnv.Xuat();
                    break;
                case 3:
                    dsnv.TimNVTheoMa(s);
                    break;
                case 4:
                    dsnv.XoaNVTheoMa(s);
                    break;
                case 5:
                    dsnv.CapNhatThongTinNVTheoMa(s);
                    dsnv.Xuat();
                    break;
                case 6:
                    dsnv.TimNVTheoKhoangLuong(s);
                    break;
                case 7:
                    dsnv.SapXepTheoTen();
                    dsnv.Xuat();
                    break;
                case 8:
                    dsnv.SapXepTheoThuNhap();
                    dsnv.Xuat();
                    break;
                case 9:
                    dsnv.Top5TheoThuNhap();
                    break;
            }
            System.out.print("Nhap phim ENTER de tiep tuc");
            s.nextLine();
        }
    }

}
