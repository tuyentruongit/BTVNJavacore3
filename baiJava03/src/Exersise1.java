import java.util.Scanner;

public class Exersise1 {
    public static void main(String[] args) {
        System.out.println("Nhập số a : ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập số b : ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Nhập số c : ");
        int c = new Scanner(System.in).nextInt();
        System.out.println("Nhập số d : ");
        int d = new Scanner(System.in).nextInt();
        int max = a;
        if (max<b){
            max=b;
        }
        if (max<c){
            max=c;
        }
        if (max<d){
            max=d;
        }
        System.out.println("Số lớn nhất  là " + max );
    }
}
