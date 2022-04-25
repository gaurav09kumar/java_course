import java.util.Scanner;

public class ArmstrongCheck {
	public static void main(String [] args){
	    
	    System.out.println("Enter the number :  ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		palindromeTest(number);
	}
	
	public static void palindromeTest(int number){
		int a,i=0,j=0;
		a=number;
		while(a>0) {
		    i=a%10;
		    j=(i*i*i)+j;
		    a=a/10;
		}
		if(number==j) {
		    System.out.println("It is amstrong");
		}
		else {
		    System.out.println("It is not a amstrong");
		}
	}
}