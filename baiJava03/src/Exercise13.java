import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        System.out.print("Nhập số n : ");
        double n = new Scanner(System.in).nextDouble();
        double S = 0;
        double i = 1;
        while (i<=n){
            S=S+1/i;
            i++;
        }
        System.out.println("Tổng dãy số tự nhiên là " + (double) Math.round(S*10000)/10000);
    }
}
