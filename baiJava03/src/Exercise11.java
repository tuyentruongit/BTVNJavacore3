import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        System.out.println("Nhập số  n : ");
        int n = new Scanner(System.in).nextInt();
        int S = 0 ;
        int S1 = 0;
        int S2 = 0;
        for (int i = 1; i <=n ; i++) {
            S+=i;
        }
        System.out.println("Tổng các số tự nhiên không lớn hơn " + n + " là " + S);
       int j = 2;
       while (j<=n){
           S1+=j;
           j=j+2;
       }
        System.out.println("Tổng các số tự nhiên chẵn không lớn hơn " + n + " là " + S1);
        int k = 1;
        while (k<=n){
            S2+=k;
            k=k+2;
        }
        System.out.println("Tổng các số tự nhiên lẻ không lớn hơn " + n + " là " + S2);
    }
}
