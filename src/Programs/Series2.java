// S = x^0 +  x^1  + x^2 + .......... + x^n

import java.util.Scanner;
import java.lang.Math;

public class Series2
{
	public static void main(String[] args) {

	    double total = 0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the x value : \n");
	    int x = sc.nextInt();
	    
	    System.out.println("Enter the n value : \n");
	    int n = sc.nextInt();
	    
	    for(int i=0 ; i<=n ; i++){
	        total = total + (Math.pow(x , i));
	    }
	    System.out.println(total);
		
	}
}
