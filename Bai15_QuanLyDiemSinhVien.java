// Bài 15: Quản lý điểm sinh viên
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Bai15_QuanLyDiemSinhVien {
    
    static class SinhVien {
        String ten;
        double diem;
        
        SinhVien(String ten, double diem) {
            this.ten = ten;
            this.diem = diem;
        }
        
        String xepLoai() {
            if (diem >= 8.0) return "Giỏi";
            if (diem >= 6.5) return "Khá";
            if (diem >= 5.0) return "Trung bình";
            return "Yếu";
        }
        
        @Override
        public String toString() {
            return String.format("%-20s | Điểm: %.2f | Xếp loại: %s", ten, diem, xepLoai());
        }
    }
    
    static class QuanLy {
        List<SinhVien> danhSach;
        
        QuanLy() {
            danhSach = new ArrayList<>();
        }
        
        void themSinhVien(SinhVien sv) {
            danhSach.add(sv);
        }
        
        double tinhDiemTrungBinh() {
            return danhSach.stream()
                          .mapToDouble(sv -> sv.diem)
                          .average()
                          .orElse(0.0);
        }
        
        SinhVien timSinhVienDiemCaoNhat() {
            return danhSach.stream()
                          .max((sv1, sv2) -> Double.compare(sv1.diem, sv2.diem))
                          .orElse(null);
        }
        
        void hienThiKetQua() {
            System.out.println("\n╔════════════════════════════════════════════════════════╗");
            System.out.println("║              KẾT QUẢ HỌC TẬP SINH VIÊN                 ║");
            System.out.println("╠════════════════════════════════════════════════════════╣");
            
            System.out.printf("║ Điểm trung bình lớp: %-30.2f║\n", tinhDiemTrungBinh());
            
            SinhVien svGioi = timSinhVienDiemCaoNhat();
            if (svGioi != null) {
                System.out.printf("║ Sinh viên xuất sắc: %-20s (%.2f)    ║\n", 
                                svGioi.ten, svGioi.diem);
            }
            
            System.out.println("╠════════════════════════════════════════════════════════╣");
            System.out.println("║ DANH SÁCH CHI TIẾT:                                    ║");
            System.out.println("╠════════════════════════════════════════════════════════╣");
            
            for (int i = 0; i < danhSach.size(); i++) {
                System.out.printf("║ %2d. %-48s║\n", (i + 1), danhSach.get(i).toString());
            }
            
            System.out.println("╚════════════════════════════════════════════════════════╝");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QuanLy ql = new QuanLy();
        
        System.out.print("Nhập số lượng sinh viên: ");
        int n = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Sinh viên thứ " + (i + 1) + " ---");
            System.out.print("Nhập tên: ");
            String ten = input.nextLine();
            System.out.print("Nhập điểm: ");
            double diem = input.nextDouble();
            input.nextLine();
            
            ql.themSinhVien(new SinhVien(ten, diem));
        }
        
        ql.hienThiKetQua();
        input.close();
    }
}
