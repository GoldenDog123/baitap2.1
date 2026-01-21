// Bài 2: Tính tổng hai số
import java.util.Scanner;

public class Bai2_TinhTongHaiSo {
    
    static int tinhTong(int x, int y) {
        return x + y;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập số thứ nhất: ");
        int soThuNhat = input.nextInt();
        
        System.out.print("Nhập số thứ hai: ");
        int soThuHai = input.nextInt();
        
        int ketQua = tinhTong(soThuNhat, soThuHai);
        System.out.printf("Tổng của %d và %d là: %d\n", soThuNhat, soThuHai, ketQua);
        
        input.close();
    }
}
