import java.util.*;
public class Demo3
{
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(13);
		arrList.add(40);
		arrList.add(5);
		arrList.add(150);
		
		System.out.println(arrList);
		
		Comparator<Integer> c = (I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(arrList,c);
		System.out.println("After sorting : " + arrList);
	}
}
