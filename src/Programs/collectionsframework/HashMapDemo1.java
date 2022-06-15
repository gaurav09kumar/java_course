import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo1
{
    public static void main(String [] args){
        
        /**
         * no order - no indexing
         * stores values --- Key-value <k,v>
         * key can be duplicate --> but it will return latest value
         * can store n number of null values but only one null key will be stored 
         * HashMap is not synchronized
         * 
         * 
         **/
        HashMap<String, String> capitalMap = new HashMap<String, String>();
        capitalMap.put("India","New Delhi");
        capitalMap.put("USA","Washington DC");
        capitalMap.put("UK","London");
        capitalMap.put("UK","London11");
        capitalMap.put(null,"Berlin"); //null key will be overriden
        capitalMap.put(null,"LA"); 
        
        capitalMap.put("Russia",null); //can have multiple null values
        capitalMap.put("France",null);
        
        capitalMap.remove("France"); //remove france entry
        
        System.out.println(capitalMap.get("USA"));
        System.out.println(capitalMap.get("Germany")); //returns null --> becuase the key is not present in capitalMap
        
        System.out.println(capitalMap.get("UK")); //returns latest value of UK Key
        
        System.out.println(capitalMap.get(null));  //returns LA
        
        System.out.println(capitalMap.get("France")); //return null
        
        //iterator --> over the keys : by using keySet()
        Iterator<String> itr = capitalMap.keySet().iterator();
        while(itr.hasNext()){
            String key = itr.next();
            String value = capitalMap.get(key);
            System.out.println("key : " + key + " and value : " + value);
        }
        
        System.out.println("---------------------------------------");
        
        //iterator : over the set(pair) : by using entrySet
        Iterator<Entry<String,String>> it1 = capitalMap.entrySet().iterator();
        while(it1.hasNext()){
            Entry<String,String> entry = it1.next();
            System.out.println("key : " + entry.getKey() + " and value : " + entry.getValue());
        }
        
        System.out.println("---------------------------------------");
        //iterate HashMap using java 8 for each and lambda
        capitalMap.forEach((k,v) -> System.out.println("key = " + k + " and value = " + v));
    }
}
