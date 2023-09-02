import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Nhập số a : ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập số b : ");
        int b = new Scanner(System.in).nextInt();
        int uocchungLonnhat = 1;
        for (int i = 1;i<=a && i<=b;i++){
            if (a%i==0 && b%i==0){
                uocchungLonnhat = i;
            }
        }
        int boichungNhonhat=(a*b)/uocchungLonnhat;
        System.out.println("Ước chung lớn nhất của của " + a + " và " + b + " là " + uocchungLonnhat);
        System.out.println("Bội chung lớn nhất của của " + a + " và " + b + " là " + boichungNhonhat);


    }
}
