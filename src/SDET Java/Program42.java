//HashMap 
import  java.util.*;
public class Program42 {
    public static void main(String [] args){
        HashMap<Integer, String> employees = new HashMap<Integer, String>();
        employees.put(101,"John");
        employees.put(103,"Mathew");
        employees.put(459,"Henry");
        
        System.out.println(employees);
        System.out.println(employees.get(101));
        
        for(Map.Entry m : employees.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }	
		//get Key set
		System.out.println(employees.keySet());
		
		//remove
		employees.remove(103);
		
		System.out.println(employees);
        
        
    }
}