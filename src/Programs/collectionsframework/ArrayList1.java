import java.util.*;
public class ArrayList1
{
    public static void main(String [] args){
        
        /**
         * dynamic array - ArrayList
         * Properties of ArrayList:
         * 1. can conntain duplicate values/elements
         * 2. maintains insertion
         * 3. Synchronized
         * 4. allows random access to fetch the element because it stores the values on the basis of indexes
         * 
         **/
        ArrayList<Integer> arrList = new ArrayList<Integer>(); 
        arrList.add(10);
        arrList.add(20);
        arrList.add(10);
        arrList.add(40);
        
        System.out.println(arrList.size()); //size of ArrayList
        
        arrList.add(50);
        arrList.add(60);
        
        System.out.println(arrList.size()); //size of ArrayList
        
        //retrieve the value at x position - allows random access
        System.out.println(arrList.get(4));
        
        /**
         * to print all the values from ArrayList : use for loop
         * 1. use for loop
         * 2. using iterator
         * 
         **/
        System.out.println("Print using for loop");
        for(int i = 0 ; i < arrList.size() ; i++){
            System.out.println("The value at index : " + i + " is : " + arrList.get(i));
        }
        
        //foreach
        System.out.println("Print using for each loop");
        for(Integer value : arrList){
            System.out.println(value);
        }
        
        //JDK-8 streams with lambda expression
        System.out.println("Print using streams with lambda expression");
        arrList.stream().forEach(ele -> System.out.println(ele));
        
        //Iterator
        System.out.println("Print using Iterator");
        Iterator<Integer> itr = arrList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        /**
         * non generic vs generic:
         * 
         * 
         **/
         //Wrapper classes
         System.out.println("----------------------------------------------");
         ArrayList<Integer> arrList2 = new ArrayList<Integer>();
         arrList2.add(100);
         System.out.println(arrList2.get(0));
         
         ArrayList<Double> arrList3 = new ArrayList<Double>();
         arrList3.add(104.44);
         System.out.println(arrList3.get(0));
         
         
         System.out.println("----------------------------------------------");
         //Creating ArrayList with another list
         ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(200,300,200));
         System.out.println(numbers);
         System.out.println(numbers.size());
         
         /**
          * default capacity of ArrayList = 10
          * numbers.get(-2) -> ArrayyIndexOutOfBoundException (Negative Indexing not allowed)
          * 
          * 
          **/
    }
}