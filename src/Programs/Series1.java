//S=0! + 1! + 2! + ............... + n!
import java.util.Scanner;
public class Series1
{
	public static void main(String[] args) {

	    int f = 1;
	    int total = 1;
	    System.out.println("Enter the n value : \n");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=1 ; i<=n ; i++){
	        f=f*i;
	        total = total + f;
	    }
		sc.close();
	    System.out.println(total);
		
	}
}
