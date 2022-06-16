//Define a 2D array with 3 rows and 3 columns and read all the values using classic for loop
import java.util.*;
public class Program21 {
	public static void main(String [] args){
	    int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
	    for(int i = 0 ; i < 3 ; i++){
	        for(int j = 0 ; j < 3 ; j++){
	            System.out.print(arr[i][j] + " ");
	        }
	        System.out.println();
	    }
	   }
	}