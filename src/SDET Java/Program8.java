//Java program to show if a person is eligible to vote
import java.util.Scanner;
public class Program8 {
	public static void main(String [] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Age : ");
	    int age = sc.nextInt();
	    sc.close();
	    if(age>=18){
	        System.out.println("Eligible to vote");
	    }
	    else{
	        System.out.println("Not Eligible to vote");
	    }
	}
}