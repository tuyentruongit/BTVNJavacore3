import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("Nhập 1 số nguyên bất kì : ");
        int n = new Scanner(System.in).nextInt();
        int S=0;
        int i;
        while (n>0){
            i=n%10;
            n/=10;
            S+=i;
        }
        System.out.println("Tổng các chữ số trên là : " + S);

    }
}
