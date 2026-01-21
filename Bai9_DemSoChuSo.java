// Bài 9: Đếm số chữ số
import java.util.Scanner;

public class Bai9_DemSoChuSo {
    
    static int demChuSo(int n) {
        if (n == 0) return 1;
        
        n = Math.abs(n);
        return (int) Math.log10(n) + 1;
    }
    
    static int demChuSoVongLap(int n) {
        if (n == 0) return 1;
        
        int count = 0;
        n = Math.abs(n);
        
        do {
            n /= 10;
            count++;
        } while (n > 0);
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập một số nguyên: ");
        int so = input.nextInt();
        
        int soChuSo = demChuSo(so);
        System.out.printf("Số %d có %d chữ số\n", so, soChuSo);
        
        input.close();
    }
}
