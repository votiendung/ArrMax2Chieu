import java.util.Arrays;
import java.util.Scanner;

public class MaxArr2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soDong, soCot;
        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();

        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();

        int[][] arr = new int[soDong][soCot];
        System.out.println("nhap cac phan tu");

        for (int i = 0; i < soDong;i++){
            for (int j = 0; j< soCot; j++)
            arr[i][j]= scanner.nextInt();
        }
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }

        int max = arr[0][0];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (max < arr[j][i]) {
                    max = arr[j][i];
                }
            }
        }
        System.out.println(max);
    }
}
