//Java program to split number into digits
public class Program13 {
	public static void main(String [] args){
	    int num = 5542;
		String number = String.valueOf(num);
		for(int i = 0; i < number.length(); i++) {
			int j = Character.digit(number.charAt(i), 10);
			System.out.println("digit: " + j);
			}
	}
}