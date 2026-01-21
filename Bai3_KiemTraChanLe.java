// Bài 3: Kiểm tra số chẵn lẻ
import java.util.Scanner;

public class Bai3_KiemTraChanLe {
    
    static boolean laSoChan(int so) {
        return (so & 1) == 0;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập một số nguyên: ");
        int so = input.nextInt();
        
        String loaiSo = laSoChan(so) ? "chẵn" : "lẻ";
        System.out.printf("%d là số %s\n", so, loaiSo);
        
        input.close();
    }
}
