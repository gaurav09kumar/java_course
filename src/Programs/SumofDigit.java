import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args){
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 0;
		sc.close();
        
        while(num>0){
            int a = num%10;
            total = total + a;
            num=num/10;
        }
        System.out.println("The total is : " + total);
        
    }
}