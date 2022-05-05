public class ArmstrongCheckRange {
	public static void main(String [] args){
	 for(int k = 1 ; k<=1000 ; k++){
	     int i=0 , j=0;
	     int a=k;
	     while(a>0){
	         i = a % 10;
	         j = Math.pow(i, 3)+j;
	         a = a/10;
	     }
	     if(j==k){
	         System.out.println(j + " is an Armstrong number \n");
	     }
	 }
	}
}