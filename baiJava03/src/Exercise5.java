import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("nhập 1 số n: ");
        int n = new Scanner(System.in).nextInt();
        int temp = n;
        int m = 0;
        while (temp!=0){
            m = m*10 + (temp%10);
            temp= temp/10;
        }
        String p = (m==n)? "n là số thuận nghịch":"n không là số thuận nghịch";
        System.out.println(p);
    }
}
