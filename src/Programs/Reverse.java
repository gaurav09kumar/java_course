import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text you want to reverse : ");
        String originaltext = sc.nextLine().trim();
        String reverse = "";
		sc.closer();
        int length = originaltext.length();
        for(int i = length-1 ; i>=0 ; i--){
            reverse = reverse + originaltext.charAt(i);
        }
        System.out.println(reverse);
        }
}