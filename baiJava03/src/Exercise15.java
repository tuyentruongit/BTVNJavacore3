import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên bất kì : ");
        int n = new Scanner(System.in).nextInt();

        System.out.print("các số chẵn là : ");
        for (int i = 1; i < n  ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.print("các số lẻ là : ");
        for (int j = 1; j < n  ; j++) {
            if (j % 2 == 1){
                System.out.print(j+" ");
            }
        }
    }
}
