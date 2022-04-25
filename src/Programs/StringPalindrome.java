import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text you want to check for Palindrome : ");
        String originaltext = sc.nextLine();
        String reverse = "";
        int length = originaltext.length();
        for(int i = length-1 ; i>=0 ; i--){
            reverse = reverse + originaltext.charAt(i);
        }
        if(originaltext.equals(reverse)){
            System.out.println(originaltext + " is a Palindrome");
        }
        else{
            System.out.println(originaltext + " is not a Palindrome");
        }
        }
}