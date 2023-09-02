import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("Tạo hình chữ nhật bằng các dấu * :");
        System.out.print("Nhập Width : ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Nhập height : ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= m ; j++) {
                System.out.print("*   ");
            }
            System.out.println("");

        }


    }
}
