//Define a single dimensional array with 5 elements and search an element prresent or not in the array.
import java.util.*;
public class Program19 {
	public static void main(String [] args){
	    int arr [] = {12,13,17,19,23};
	    int valueToCheck = 17 ;
	    boolean result= false;
	    for(int value : arr){
	        if(valueToCheck==value){
	            result = true;
	            break;
	        }
	    }
	    if(result==true){
	        System.out.println("Element present");
	    }
	    else{
	        System.out.println("Element not present");
	    }
	   }
	}