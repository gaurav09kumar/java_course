// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
import java.util.Iterator;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <String> arrList = new <String>ArrayList() ;
        arrList.add("Ravi");//Adding object in arraylist  
        arrList.add("Vijay");  
        arrList.add("Ravi");  
        arrList.add("Ajay");  
        
        
        //Traversing list through Iterator  
        Iterator itr =  arrList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        //Traversing list through for-each loop  
        for(String item:arrList)    
            System.out.println(item);   
            
        ArrayList<String> arrlist2 = 
                             new ArrayList<String>(5);
  
        // use add() method to add elements in list2
        arrlist2.add("Demo1");
        arrlist2.add("Demo2");
        
        // inserting all elements, list2 will get printed
        // after list1
        arrList.addAll(arrlist2);
        
        System.out.println("Printing all the elements");
        // let us print all the elements available in 
        // list1
        for (String number : arrList) 
            System.out.println("Number = " + number); 
		
		//accessing the element    
		System.out.println("Returning element: "+arrList.get(1));//it will return the 2nd element, because index starts from 0  //changing the element  
		arrList.set(1,"Dates");  
		//Traversing list  
		for(String item:arrList)    
			System.out.println(item);    
    }
}