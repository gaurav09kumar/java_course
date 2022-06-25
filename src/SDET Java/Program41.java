//ArrayList
import java.util.*;  
public class Program41{
    public static void main(String [] args){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Ajay");
        arr.add("Mathew");
        arr.add("John");
        arr.add("Nancy");
		arr.add("Henry");
        
        for(String name : arr){
            System.out.println(name);
        }
		
		System.out.println(arr.contains("Nancy"));
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(34);
		arr2.add(12);
		arr2.add(45);
		arr2.add(32);
		arr2.add(10);
		
		//print in reverse order
		for(int i=(arr2.size())-1 ; i>=0 ; i--){
			System.out.println(arr2.get(i));
		}
    }
}