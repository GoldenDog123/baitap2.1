// Bài 13: Đảo ngược chuỗi
import java.util.Scanner;

public class Bai13_DaoNguocChuoi {
    
    static String daoNguocChuoi1(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    
    static String daoNguocChuoi2(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        return new String(arr);
    }
    
    static String daoNguocChuoi3(String s) {
        if (s.isEmpty()) return s;
        return daoNguocChuoi3(s.substring(1)) + s.charAt(0);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập một chuỗi: ");
        String chuoi = input.nextLine();
        
        String ketQua = daoNguocChuoi1(chuoi);
        
        System.out.println("Chuỗi gốc:       " + chuoi);
        System.out.println("Chuỗi đảo ngược: " + ketQua);
        
        input.close();
    }
}
