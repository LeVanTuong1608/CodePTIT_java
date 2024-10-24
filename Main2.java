/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author admin
 */
//import bai1.Main2.DuAnCNTT;

import java.util.Scanner;
import java.util.regex.Pattern;

// Interface IDuAn
interface IDuAn {
    boolean IsMa(String ma);
    boolean isSo(String so);
    double getTongTien();
}

// Lớp DuAn cơ bản
class DuAn {
    String ma;
    String ten;
    double tongChiPhi;

    public DuAn() {}

    public DuAn(String ma, String ten, double tongChiPhi) {
        this.ma = ma;
        this.ten = ten;
        this.tongChiPhi = tongChiPhi;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public double getTongChiPhi() {
        return tongChiPhi;
    }

    public void setTongChiPhi(double tongChiPhi) {
        this.tongChiPhi = tongChiPhi;
    }
}

// Lớp DuAnCNTT kế thừa từ DuAn và implement IDuAn
class DuAnCNTT extends DuAn implements IDuAn {
    String loaiDuAn;
    int soThangBaoTri;

    public DuAnCNTT() {}

    public DuAnCNTT(String ma, String ten, String loaiDuAn, int soThangBaoTri, double tongChiPhi) {
        super(ma, ten, tongChiPhi);
        this.loaiDuAn = loaiDuAn;
        this.soThangBaoTri = soThangBaoTri;
    }

    public void setLoaiDuAn(String loaiDuAn) {
        this.loaiDuAn = loaiDuAn;
    }

    public void setSoThangBaoTri(int soThangBaoTri) {
        this.soThangBaoTri = soThangBaoTri;
    }

    public String getLoaiDuAn() {
        return loaiDuAn;
    }

    public int getSoThangBaoTri() {
        return soThangBaoTri;
    }

    @Override
    public boolean IsMa(String ma) {
        // Kiểm tra mã dự án với định dạng it2023-XX
        return Pattern.matches("^it2023-\\d{2}$", ma);
    }

    @Override
    public boolean isSo(String so) {
        try {
            return Integer.parseInt(so) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public double getTongTien() {
        // Tính toán tổng chi phí dựa trên số tháng bảo trì
        if (soThangBaoTri >= 5) {
            return tongChiPhi * 1.1;
        } else {
            return tongChiPhi;
        }
    }

    // Phương thức nhập dữ liệu cho dự án
    public void input(Scanner in) {
        // Nhập mã dự án và kiểm tra đến khi hợp lệ
        while (true) {
            //System.out.print("Nhập mã dự án: ");
            ma = in.nextLine().trim();
            if (!IsMa(ma)) {
                System.out.println("nhap sai");
            } else {
                break;
            }
        }

        // Nhập tên dự án
        //System.out.print("Nhập tên dự án: ");
        ten = in.nextLine().trim();

        // Nhập tổng chi phí và kiểm tra hợp lệ
        while (true) {
            //System.out.print("Nhập tổng chi phí: ");
            try {
                tongChiPhi = Double.parseDouble(in.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println("nhap sai");
            }
        }

        // Nhập số tháng bảo trì và kiểm tra hợp lệ
        while (true) {
            //System.out.print("Nhập số tháng bảo trì: ");
            String thangBaoTri = in.nextLine().trim();
            if (!isSo(thangBaoTri)) {
                System.out.println("nhap sai");
            } else {
                soThangBaoTri = Integer.parseInt(thangBaoTri);
                break;
            }
        }

        // Nhập loại dự án
        //System.out.print("Nhập loại dự án: ");
        loaiDuAn = in.nextLine().trim();

        // Kiểm tra và in kết quả nếu hợp lệ
        if (soThangBaoTri > 0) {
            if (soThangBaoTri >= 5) {
                tongChiPhi *= 1.1;
            }
            //System.out.println(this);
        } else {
            System.out.println("nhap sai");
        }
    }

    @Override
    public String toString() {
        return getMa() + " " + getTen() + " " + loaiDuAn + " " + soThangBaoTri + "      " + String.format("%.1f", getTongTien());
    }
}

// Lớp Main2 để chạy chương trình
public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Nhập dự án CNTT
        DuAnCNTT duAn = new DuAnCNTT();
        duAn.input(in); // Gọi phương thức input để nhập và kiểm tra dữ liệu dự án
    }
}

