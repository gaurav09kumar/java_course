import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList
{
    public static void main(String [] args){
        
        List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
        
        namesList.add("Java");
        namesList.add("Python");
        namesList.add("Ruby");
        
        //add,remove - we dont need explicit synchronization
        
        //To fetch/traverse the value from the List -- we have to use explicit synchronization
        
        synchronized (namesList) {
            Iterator<String> itr = namesList.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    //2nd Method - use thread safe variant of ArrayList ---> copyOnWriteArrayList --- its a class --- available in
    CopyOnWriteArrayList <String> empList = new CopyOnWriteArrayList<String>();
    empList.add("Steve");
    empList.add("John");
    empList.add("Mathew");
    
    
    //Here we dont need any explicit synchronization for any operations ---> add/remove/traverse
    //It is Thread safe / synchronized already
    
    Iterator<String> itr = empList.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
        
    }
}
