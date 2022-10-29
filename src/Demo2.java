import java.util.*;

class MyComparator implements Comparator<Integer>{
    public int compare(Integer I1, Integer I2){
        if(I1<I2){
            return -1; //lower element then -1
        }
        else if(I1>I2){
            return 1;
        }
        else{
            return 0;
        }
    }
}
public class Demo2
{
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(13);
		arrList.add(40);
		arrList.add(5);
		arrList.add(150);
		
		for(int item : arrList){
		    System.out.println(item);
		}
		
		System.out.println("Before Sort : " + arrList);
		
		Collections.sort(arrList,new MyComparator());
		System.out.println(arrList);
		
	}
}
