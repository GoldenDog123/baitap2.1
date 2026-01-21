// Bài 14: Viết hàm kiểm tra số nguyên tố
import java.util.ArrayList;
import java.util.List;

public class Bai14_HamSoNguyenTo {
    
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    static List<Integer> timSoNguyenTo(int min, int max) {
        List<Integer> danhSach = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                danhSach.add(i);
            }
        }
        return danhSach;
    }
    
    static void hienThiSoNguyenTo(List<Integer> ds, int soPhanTuMoiDong) {
        System.out.println("Các số nguyên tố từ 1 đến 100:");
        System.out.println("Tổng cộng: " + ds.size() + " số\n");
        
        for (int i = 0; i < ds.size(); i++) {
            System.out.printf("%3d ", ds.get(i));
            if ((i + 1) % soPhanTuMoiDong == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        List<Integer> soNguyenTo = timSoNguyenTo(1, 100);
        hienThiSoNguyenTo(soNguyenTo, 10);
    }
}
