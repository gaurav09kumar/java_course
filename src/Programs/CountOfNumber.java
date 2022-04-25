import java.util.Scanner;

public class CountOfNumber {
    public static void main(String[] args){
        System.out.println("Enter the number ; ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
		sc.close();
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("The count is : " + count);
        
    }
}