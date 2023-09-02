import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.print("Nhập height :");
        int height = new Scanner(System.in).nextInt();
        for (int i = 1; i <= height ; i++) {
            for (int j = 1; j<=i  ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
