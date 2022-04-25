import java.util.Scanner;

public class Palindrome {
	public static void main(String [] args){
	    
	    System.out.println("Enter the number you want to check for Palindrome : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		palindromeTest(number);
	}
	
	public static void palindromeTest(int number){
		int a, i=0, j=0;
		a = number;
		
		while(a>0){
			i = a % 10;
			j = (j * 10) + i;
			a=a/10;
		}
		System.out.println("Reversed Number is : " + j + "\n");
		if(number==j){
		    System.out.println(number + " is a Palindrome");
		}
		else{
		    System.out.println(number + " is not a Palindrome");
		}
	}
}