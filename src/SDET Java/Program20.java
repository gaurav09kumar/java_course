//Define a string array with 5 strings and search for a string in an array.
import java.util.*;
public class Program20 {
	public static void main(String [] args){
	    String arr [] = {"Loren","John","Mathew","Henry","Kevin"};
	    String valueToCheck = "Ma" ;
	    boolean result= false;
	    for(String value : arr){
	        if(valueToCheck.equals(value)){
	            result = true;
	            break;
	        }
	    }
	    if(result==true){
	        System.out.println("String present");
	    }
	    else{
	        System.out.println("String not present");
	    }
	   }
	}