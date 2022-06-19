public class Program25 {
	public static void main(String [] args){
	    //Write a Java Program to get the character at the given index within the String
	    String s1 = "This is a String";
	    System.out.println(s1);
	    System.out.println(s1.charAt(2));
	    
	    //Concatenate two strings
	    System.out.println("-------------------------");
	    String s2 = s1.concat(": Added new String");
	    System.out.println(s2);
	    
	    System.out.println("-------------------------");
	    //test if a given String contains the specified sequence of char values
	    System.out.println(s2.contains("new"));
	    System.out.println(s2.contains("Z"));
	    
	    System.out.println("-------------------------");
	    //compare two strings to another string, ignore case considerations
	    String s3 = "Demo String";
	    String s4 = "demo string";
	    
	    System.out.println(s3.equals(s4));
	    System.out.println(s3.equalsIgnoreCase(s4));
	    
	    System.out.println("-------------------------");
	    
	    //Get the length of given string
	    System.out.println(s3.length());
	    
	    System.out.println("-------------------------");
	    
	    //remove vowels from a string
	    String s5 = s3.replaceAll("[aeiouAEIOU]","");
	    System.out.println(s5);
	    
	    System.out.println("-------------------------");
	    
	    String s6 = "Welcome to selenium java training";
	
	    System.out.println("Number of Characters present in String : " + s6.length());
	    String s7 = s6.toUpperCase();
	    System.out.println("Upper Case : " + s7);
	    String s8 = s6.toLowerCase();
	    System.out.println("Lower Case : " + s8);
	    
	    System.out.println("-------------------------");
	    
	    System.out.println(s6.contains("selenium"));
	    
	    System.out.println("-------------------------");
	    
	    int i = s1.length()-1;
	    while(i >= 0){
	        System.out.print(s1.charAt(i));
	        i--;
	    }
	    
	   }
	}