//Java program to reverse of a number
import java.util.*;
public class Program16 {
	public static void main(String [] args){
	    int number = 5542, reverse = 0;
	    System.out.println("Reverse of " + number + " is : ");
	    while(number>0){
	        int temp = number % 10;
	        reverse = reverse * 10 + temp;
	        number = number / 10;
	    }
	    System.out.println(reverse);
	   }
	}