import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateArrayList
{
    public static void main(String [] args){
        ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(1,2,1,3,3,4,5,5,6,7,7,8,9,10));
        
        //Remove duplicates from ArrayList
        
        //1. LinkedHashSet -- It can be used on Any type of data
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbersList);
        
        ArrayList<Integer> numbersWithOutDuplicates = new ArrayList<Integer>(linkedHashSet);
        
        System.out.println("Results from LinkedHashSet : " + numbersWithOutDuplicates);
        
        //JDK-8 Streams
        ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,1,3,3,4,5,5,6,7,7,8,9,10));
        List<Integer> uniqueMarksList = marksList.stream().distinct().collect(Collectors.toList());
        
        System.out.println("Result from Streams : " + uniqueMarksList);
		
		//With Iterator
		ArrayList<Integer> marksList2 = new ArrayList<Integer>(Arrays.asList(1,2,1,3,3,4,5,5,6,7,7,8,9,10));
		Iterator<Integer> itr = marksList2.stream().distinct().iterator();
		System.out.println("Result from iterator : ");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
    }
}
