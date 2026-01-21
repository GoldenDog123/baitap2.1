// Bài 11: Tổng mảng
import java.util.Scanner;
import java.util.Arrays;

public class Bai11_TongMang {
    
    static int tinhTongMang(int[] mang) {
        return Arrays.stream(mang).sum();
    }
    
    static int[] nhapMang(Scanner input, int soPhanTu) {
        int[] mang = new int[soPhanTu];
        System.out.println("Nhập các phần tử của mảng:");
        
        for (int i = 0; i < soPhanTu; i++) {
            System.out.printf("arr[%d] = ", i);
            mang[i] = input.nextInt();
        }
        return mang;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập số phần tử của mảng: ");
        int n = input.nextInt();
        
        int[] arr = nhapMang(input, n);
        int tong = tinhTongMang(arr);
        
        System.out.println("\nMảng: " + Arrays.toString(arr));
        System.out.println("Tổng các phần tử: " + tong);
        
        input.close();
    }
}
