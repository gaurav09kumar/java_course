import java.util.*;
public class ArrayList2
{
    public static void main(String [] args){
        
        /**
         * Demonstrate ArrayList methods
         * 
         **/ 
        
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("John");
        arrList.add("Mathew");
        arrList.add("John");
        
        System.out.println(arrList);
        
        ArrayList<String> arrList2 = new ArrayList<String>();
        arrList2.add("Mary");
        arrList2.add("Noddy");
        arrList2.add("Bob");
        
        //Add arrList2 to arrList using addAll() method
        arrList.addAll(arrList2);
        
        System.out.println(arrList);
        
        //addAll from a particular index
        arrList.addAll(1,arrList2);
        
        System.out.println(arrList);
        
        //clear the ArrayList
        arrList.clear();
        System.out.println(arrList);
        
        //clone the arrList2 into a new List
        ArrayList<String> cloneList = (ArrayList<String>)arrList2.clone();
        System.out.println("Clone List is : " + cloneList);
        
        //contains method
        System.out.println(cloneList.contains("Bob"));
        
        //indexOf method
        System.out.println(cloneList.indexOf("Bob")>0);
        
        //lastIndexOf method
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Bob","Mary","Bob","Test","John","Bob"));
        System.out.println(list1);
        
        int i = list1.lastIndexOf("Bob");
        System.out.println(i);
        
        //We can remove either by index or by value
        //remove() method
        list1.remove(1);
        System.out.println(list1);
        
        list1.remove("Bob"); //removes the first match it found
        System.out.println(list1);
        
        //removeIf() method
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //remove all the even numbers & print odd numbers
        list2.removeIf(num -> num%2==0);
        System.out.println(list2);
        
        
        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //remove all the odd numbers & print even numbers
        list3.removeIf(num -> num%2!=0);
        System.out.println(list3);
        
        //retainAll method
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("John","Mary","Tom","Cat","Mary"));
        System.out.println(namesList);
        
        //retain only Mary in the namesList
        namesList.retainAll(Collections.singleton("Mary"));
        System.out.println(namesList);
        
        //get a sublist from a list (x,x-1)
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        
        ArrayList<Integer> subList_numbers = new ArrayList<Integer>(numbers.subList(2,6));
        System.out.println(subList_numbers);
        
        //convert ArrayList to array
        ArrayList<String> namesList2 = new ArrayList<String>(Arrays.asList("John","Mary","Tom","Cat","Mary"));
        System.out.println(namesList2);
        
        Object arr[] = namesList2.toArray();
        System.out.println(Arrays.toString(arr));
        
        for(Object value:arr){
            System.out.println((String)value);
        }
    }
}
