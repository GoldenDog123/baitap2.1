// Bài 8: Bảng cửu chương
import java.util.Scanner;

public class Bai8_BangCuuChuong {
    
    static void inBangCuuChuong(int n) {
        System.out.println("\n╔════════════════════════╗");
        System.out.printf("║  BẢNG CỬU CHƯƠNG %d    ║\n", n);
        System.out.println("╠════════════════════════╣");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("║  %d x %2d = %3d         ║\n", n, i, n * i);
        }
        
        System.out.println("╚════════════════════════╝");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        do {
            System.out.print("Nhập số n (1-9): ");
            n = input.nextInt();
            
            if (n < 1 || n > 9) {
                System.out.println("⚠ Vui lòng nhập số từ 1 đến 9!");
            }
        } while (n < 1 || n > 9);
        
        inBangCuuChuong(n);
        
        input.close();
    }
}
