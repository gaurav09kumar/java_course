import java.util.*;
import java.util.stream.Collectors;

public class CompareTwoArrayList
{
    public static void main(String [] args){
        ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("B","A","D","C","F"));
        
        ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("B","A","D","C","E"));
        
        ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
        
        //1.Sort both the lists before comparing --> best practice
        Collections.sort(l1);
        Collections.sort(l2);
        
        //compare both the lists
        //it will check one to one index matching
        System.out.println(l1.equals(l2)); //false
        
        System.out.println(l1.equals(l3)); //true
        
        
        
        //2.compare tow list -- find out the additional elements:
        ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("B","A","D","C","F"));
        
        ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("B","A","D","C","E"));
        
        l4.removeAll(l5); //remove all the elements available from l4 with respect to elements in l5
        
        System.out.println(l4); //Output should be F --> F is not available in l5 so it will remain
        
        
        //3. Find out missing elements in l7 when compared with l6
        ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("B","A","D","C","F"));
        
        ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("B","A","D","C","E"));
        
        l7.removeAll(l6);
        System.out.println(l7); //E
        
        //4. Find out all the common elements in both the arrays
        ArrayList<String> language1 = new ArrayList<String>(Arrays.asList("Java","Ruby","Python","JS","PHP"));
        
        ArrayList<String> language2 = new ArrayList<String>(Arrays.asList("Java","Ruby","Python","JS","C#"));
        
        //use retainAll method - returns common elements
        language1.retainAll(language2);
        
        System.out.println(language1); //Output should be ["Java","Ruby","Python","JS"]
        
        
    }
}
