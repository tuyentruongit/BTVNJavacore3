import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên n để tìm ước số của nó : ");
            int n = new Scanner(System.in).nextInt();
        System.out.print("Các ước số của " + n + " là : ");
            for (int i = 1;i<=n;i++){
                if (n%i==0){
                    System.out.print( i + "\t" );
                }
            }
    }
}
