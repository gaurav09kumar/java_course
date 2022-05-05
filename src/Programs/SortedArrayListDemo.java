import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class SortedArrayListDemo {
    public static void main(String[] args) {
        ArrayList <Integer> arrList = new <Integer> ArrayList() ;
        arrList.add(45);
        arrList.add(15);
        arrList.add(30);
        arrList.add(15);
        
        for(Integer item : arrList)
            System.out.println(item);
        
        //Sorting the List
        Collections.sort(arrList);
        
        System.out.println("After Sorting : ");
        
        for(Integer item : arrList)
            System.out.println(item);
            
        System.out.println("--------------------------------");
        
        ArrayList <String> arrList2 = new <String> ArrayList() ;
        arrList2.add("Bob");
        arrList2.add("John");
        arrList2.add("Test");
        arrList2.add("John");
        
        for(String item : arrList2)
            System.out.println(item);
        
        //Sorting the List
        Collections.sort(arrList2);
        
        System.out.println("After Sorting : ");
        
        for(String item : arrList2)
            System.out.println(item);
            
        
    }
}