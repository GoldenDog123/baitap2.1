// Bài 10: Kiểm tra số nguyên tố
import java.util.Scanner;

public class Bai10_KiemTraSoNguyenTo {
    
    static boolean kiemTraNguyenTo(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        // Kiểm tra các số dạng 6k ± 1
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên n: ");
        int n = input.nextInt();
        
        String ketQua = kiemTraNguyenTo(n) ? "là" : "không phải là";
        System.out.printf("%d %s số nguyên tố\n", n, ketQua);
        
        input.close();
    }
}
