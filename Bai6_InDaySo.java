// Bài 6: In dãy số từ 1 đến 100
public class Bai6_InDaySo {
    
    static void inDaySo(int batDau, int ketThuc, int soPhanTuMoiDong) {
        System.out.println("Các số từ " + batDau + " đến " + ketThuc + ":");
        int dem = 0;
        for (int i = batDau; i <= ketThuc; i++) {
            System.out.printf("%3d ", i);
            dem++;
            if (dem % soPhanTuMoiDong == 0) {
                System.out.println();
            }
        }
        if (dem % soPhanTuMoiDong != 0) {
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        inDaySo(1, 100, 10);
    }
}
