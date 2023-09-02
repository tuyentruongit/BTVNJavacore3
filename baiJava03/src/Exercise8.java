import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.print("Nhập Width : ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Nhập height : ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= m ; j++) {
                if (i==1 || i==n || j==1 || j==m){
                    System.out.print("*     ");
                }else {
                    System.out.print("      ");
                }
            }
            System.out.println("");
        }
    }
}
