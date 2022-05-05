//Write a Java Program to swap two given Strings
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
public class StringSwapExample {

public static void main(String[] args) {
	// Take two string s1 and s2 which we need to swap.
	System.out.println("Take two string s1 and s2 which we need to swap");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the s1 : ");
	String s1 = sc.nextLine().trim();
	System.out.println("Enter the s2 : ");
	String s2 = sc.nextLine().trim();
	sc.close();
	
	// Combine both the strings s1 and s2 using the concatenation(+) operator
	s1 = s1 + s2;
	
	// Use the substring method to get the subset of the combined string
	s2 = s1.substring(0, s1.length() - s2.length());
	s1 = s1.substring(s2.length());
	
	System.out.println("s1 =" + s1);
	System.out.println("s2 =" + s2);
	}
}