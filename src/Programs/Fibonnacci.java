import java.util.Scanner;

public class Fibonnacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i <= number; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
        }
}