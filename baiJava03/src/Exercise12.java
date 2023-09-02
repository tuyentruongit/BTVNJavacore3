import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        System.out.println("Nhập vào 1 số c: ");
        double c = new Scanner(System.in).nextDouble();
        double pi = 0;
        long n = (long)((1/c -1)/2);
        for(long i = 0; i <= n; i++){
            pi += Math.pow(-1, i)*(1.0/(2*i+1));
        }
        pi *= 4;
        System.out.println("pi= " +pi);
    }
}
