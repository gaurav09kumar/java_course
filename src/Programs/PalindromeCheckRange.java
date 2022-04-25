public class PalindromeCheckRange {
	public static void main(String [] args){
	    for(int i = 1 ; i <= 100 ; i++){
	        int a = i;
	        int j = 0 ; int k=0;
	        while(a>0){
	            j=a%10;
	            k=(k*10)+j;
	            a=a/10;
	        }
	        if(k==i){
	            System.out.println(k + " is a Palindrome Number");
	        }
	    }
	 }
	}