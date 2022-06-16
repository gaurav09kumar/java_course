//Java program to sum digits of a number
import java.util.*;
public class Program15 {
	public static void main(String [] args){
	    int number = 5542;
	    System.out.println("Sum digits of a " + number + " is : ");
	    int result = 0;
	    while(number>0){
	        result = result + (number % 10);
	        number = number / 10;
	    }
	    System.out.println(result);
	   }
	}