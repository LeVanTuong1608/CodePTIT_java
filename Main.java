/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
//import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    static class DuAn {
        private String ma;
        private String ten;
        private double tongChiPhi;

        public DuAn() {
        }

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

    static interface IDuAn {
        boolean isMa(String ma);
        boolean isSo(String so);
        double getTongTien();
    }

    static class DuAnCNTT extends DuAn implements IDuAn {
        private String loaiDuAn;
        private int soThangBaoTri;

        public DuAnCNTT() {
            super();
        }

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

        public boolean isMa(String ma) {
            return ma.startsWith("it") && ma.matches("it\\d{4}-\\d{2}");
        }

        public boolean isSo(String so) {
            return so.matches("\\d+");
        }

        public double getTongTien() {
            return getTongChiPhi();
        }

        public void input(Scanner in) {
            String ma;
            do {
                System.out.print("Nhập mã dự án: ");
                ma = in.nextLine();
                if (!isMa(ma)) {
                    System.out.println("Nhập sai");
                }
            } while (!isMa(ma));

            System.out.print("Nhập tên dự án: ");
            String ten = in.nextLine();

            double tongChiPhi = -1;
            do {
                System.out.print("Nhập tổng chi phí: ");
                String temp = in.nextLine();
                if (isSo(temp)) {
                    tongChiPhi = Double.parseDouble(temp);
                } else {
                    System.out.println("Nhập sai");
                }
            } while (tongChiPhi < 0);

            int soThangBaoTri = -1;
            do {
                System.out.print("Nhập số tháng bảo trì: ");
                String temp = in.nextLine();
                if (isSo(temp)) {
                    soThangBaoTri = Integer.parseInt(temp);
                } else {
                    System.out.println("Nhập sai");
                }
            } while (soThangBaoTri < 0);

            System.out.print("Nhập loại dự án: ");
            String loaiDuAn = in.nextLine();

            setLoaiDuAn(loaiDuAn);
            setSoThangBaoTri(soThangBaoTri);

            // Tăng tổng chi phí nếu số tháng bảo trì >= 5
            if (soThangBaoTri >= 5) {
                tongChiPhi *= 1.1; // Tăng chi phí 10%
            }
            setTongChiPhi(tongChiPhi);

            System.out.println(this);
        }

        @Override
        public String toString() {
            return String.format("%s %s %s %d %.1f", getMa(), getTen(), getLoaiDuAn(), getSoThangBaoTri(), getTongChiPhi());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DuAnCNTT duAn = new DuAnCNTT();
        duAn.input(scanner);
        scanner.close();
    }
}

/*
input:
abc
it2023-12
du an a
100
ab
6
phan mem
output:
nhap sai
nhap sai
it2023-12 du an a phan mem 6      110.0
input:
abc
it2023-23
du an b
200
cd
4
phan cung
output:
nhap sai
nhap sai
it2023-23 du an b phan cung 4      200.0
*/