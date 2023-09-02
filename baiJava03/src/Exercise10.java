import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.print("Nhập height : ");
        int height  = new Scanner(System.in).nextInt();

        for (int i = 1; i <= height ; i++) {
            for (int k = height; k >i ; k--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i*2-1 ; j++) {
                System.out.print(" * ");
            }
            System.out.println("");


        }
    }
}
