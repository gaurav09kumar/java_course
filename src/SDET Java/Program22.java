//Define a 2D array with 3 rows and 3 columns and read all the values using for each loop
import java.util.*;
public class Program22 {
	public static void main(String [] args){
	    int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
	    for(int [] value : arr) {
	        for(int value1 : value){
	            System.out.print(value1 + " ");
	        }
	        System.out.println();
	        }
	    }
	}