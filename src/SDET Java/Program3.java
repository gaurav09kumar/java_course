public class Program3 {
	public static void main(String [] args){
	    int num1 = 15 , num2 = 10 ;
	    System.out.println("Before Swap");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : "+ num2);
		int temp = 15+10;
		num2 = temp-num2;
		num1 = temp-num1;
		System.out.println("After Swap");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : "+ num2);
	}
}