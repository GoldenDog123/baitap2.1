// Bài 4: Tính chu vi và diện tích hình chữ nhật
import java.util.Scanner;

public class Bai4_HinhChuNhat {
    
    static class HinhChuNhat {
        double chieuDai, chieuRong;
        
        HinhChuNhat(double dai, double rong) {
            this.chieuDai = dai;
            this.chieuRong = rong;
        }
        
        double tinhChuVi() {
            return (chieuDai + chieuRong) * 2;
        }
        
        double tinhDienTich() {
            return chieuDai * chieuRong;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập chiều dài: ");
        double d = input.nextDouble();
        
        System.out.print("Nhập chiều rộng: ");
        double r = input.nextDouble();
        
        HinhChuNhat hcn = new HinhChuNhat(d, r);
        
        System.out.printf("Chu vi: %.2f\n", hcn.tinhChuVi());
        System.out.printf("Diện tích: %.2f\n", hcn.tinhDienTich());
        
        input.close();
    }
}
