import java.util.Scanner;

public class ReverseNumber {
	public static void main(String [] args){
	    
	    System.out.println("Enter the number you want to reverse : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		System.out.println("The reverse of " + number + " is : " + reverseNumber( number));
	}
	
	public static int reverseNumber(int number){
		int a, i=0, j=0;
		a = number;
		
		while(a>0){
			i = a % 10;
			j = (j * 10) + i;
			a=a/10;
		}
		return j;
	}
}