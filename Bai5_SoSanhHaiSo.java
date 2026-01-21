// Bài 5: So sánh hai số
import java.util.Scanner;

public class Bai5_SoSanhHaiSo {
    
    static void soSanh(int x, int y) {
        int max = Math.max(x, y);
        
        if (x == y) {
            System.out.println("Hai số bằng nhau");
        } else {
            System.out.println("Số lớn hơn là: " + max);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập số thứ nhất: ");
        int so1 = input.nextInt();
        
        System.out.print("Nhập số thứ hai: ");
        int so2 = input.nextInt();
        
        soSanh(so1, so2);
        
        input.close();
    }
}
