//Java program to split number into digits
import java.util.*;
public class Program14 {
	public static void main(String [] args){
	    int number = 5542;
	    LinkedList<Integer> stack = new LinkedList<Integer>();
	    while(number>0){
	        stack.push( number % 10 );
	        number = number / 10;
	    }
	    while (!stack.isEmpty()) {
	        System.out.println(stack.pop());
	    }
	   }
	}