import java.util.Scanner;

public class NumberSwap2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2 : ");
        int num2 = sc.nextInt();
        num2=num1+num2;
        num1=num2-num1;
        num2=num2-num1;
        
        System.out.println("The swapped numbers are : " + num1 + " and " + num2);
        
    }
}