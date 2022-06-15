//Java program to check whether number is positive negative or zero
import java.util.Scanner;
public class Program7 {
	public static void main(String [] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    int num = sc.nextInt();
	    sc.close();
	    if(num>0){
	        System.out.println(num + " is positive");
	    }
	    else if(num<0){
	        System.out.println(num + " is negative");
	    }
	    else{
	        System.out.println("Value is : " + num + " : Zero");
	    }
	}
}