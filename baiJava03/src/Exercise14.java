import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        System.out.print("Nhập số tự nhiên n : ");
        int n = new Scanner(System.in).nextInt();
        int S = 0 ;
        for (int i = 1; i <=n ; i++) {
            if (i%7==0){
                S+=i;
            }
        }
        System.out.println("Tổng các số tự nhiên không lớn hơn " + n + " và chia hết cho 7 là : " +S);

    }
}
