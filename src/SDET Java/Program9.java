//Java program to print month name based month number as an input using if else
import java.util.Scanner;
public class Program9 {
	public static void main(String [] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Month Number : ");
	    int monthNumber = sc.nextInt();
	    sc.close();
	    if(monthNumber>=1 && monthNumber<=12){
	        if(monthNumber==1){
	            System.out.println("Month is : January");
	        }
	        else if(monthNumber==2){
	            System.out.println("Month is : February");
	        }
	        else if(monthNumber==3){
	            System.out.println("Month is : March");
	        }
	        else if(monthNumber==4){
	            System.out.println("Month is : April");
	        }
	        else if(monthNumber==5){
	            System.out.println("Month is : May");
	        }
	        else if(monthNumber==6){
	            System.out.println("Month is : June");
	        }
	        else if(monthNumber==7){
	            System.out.println("Month is : July");
	        }
	        else if(monthNumber==8){
	            System.out.println("Month is : August");
	        }
	        else if(monthNumber==9){
	            System.out.println("Month is : September");
	        }
	        else if(monthNumber==10){
	            System.out.println("Month is : October");
	        }
	        else if(monthNumber==11){
	            System.out.println("Month is : November");
	        }
	        else {
	            System.out.println("Month is : December");
	        }
	    }
	    else{
	        System.out.println("Enter Month Number between in 1 and 12");
	    }
	}
}