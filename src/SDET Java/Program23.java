//Define a Object array with multiple data types and print them using for..each loop.
import java.util.*;
public class Program23 {
	public static void main(String [] args){
	    Object arr [] = new Object [5]; 
	    arr[0] = 5.5;
	    arr[1] = "Martha";
	    arr[2] = 3;
	    arr[3] = true;
	    arr[4] = "Ash";
	    
	    for(Object value : arr){
	        System.out.println(value);
	    }
	    }
	}