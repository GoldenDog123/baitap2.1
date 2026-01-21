// Bài 12: Tìm phần tử lớn nhất và nhỏ nhất
import java.util.Scanner;
import java.util.Arrays;

public class Bai12_TimMinMax {
    
    static class KetQua {
        int min, max;
        int viTriMin, viTriMax;
        
        KetQua(int min, int max, int viTriMin, int viTriMax) {
            this.min = min;
            this.max = max;
            this.viTriMin = viTriMin;
            this.viTriMax = viTriMax;
        }
    }
    
    static KetQua timMinMax(int[] mang) {
        int min = mang[0], max = mang[0];
        int viTriMin = 0, viTriMax = 0;
        
        for (int i = 1; i < mang.length; i++) {
            if (mang[i] < min) {
                min = mang[i];
                viTriMin = i;
            }
            if (mang[i] > max) {
                max = mang[i];
                viTriMax = i;
            }
        }
        
        return new KetQua(min, max, viTriMin, viTriMax);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập số phần tử của mảng: ");
        int n = input.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = input.nextInt();
        }
        
        KetQua kq = timMinMax(arr);
        
        System.out.println("\nMảng: " + Arrays.toString(arr));
        System.out.printf("Giá trị nhỏ nhất: %d (tại vị trí %d)\n", kq.min, kq.viTriMin);
        System.out.printf("Giá trị lớn nhất: %d (tại vị trí %d)\n", kq.max, kq.viTriMax);
        
        input.close();
    }
}
