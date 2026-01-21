// Bài 7: Tính tổng từ 1 đến n
import java.util.Scanner;

public class Bai7_TinhTongTu1DenN {
    
    static long tinhTongCongThuc(int n) {
        // Sử dụng công thức: S = n * (n + 1) / 2
        return (long) n * (n + 1) / 2;
    }
    
    static long tinhTongVongLap(int n) {
        long tong = 0;
        int i = 1;
        while (i <= n) {
            tong += i;
            i++;
        }
        return tong;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên n: ");
        int n = input.nextInt();
        
        long ketQua = tinhTongCongThuc(n);
        System.out.printf("Tổng từ 1 đến %d là: %d\n", n, ketQua);
        
        input.close();
    }
}
