import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2 : ");
        int num2 = sc.nextInt();
        int temp = 0;
        temp=num2;
        num2=num1;
        num1=temp;
        
        System.out.println("The swapped numbers are : " + num1 + " and " + num2);
        
    }
}