import java.util.Scanner;

public class EvenOrOddCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int evenCount=0; 
        int oddCount = 0;
        if(number>0){
            for(int i = 1 ; i <= number ; i++ ){
                if(i%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            }
            System.out.println("Total Even Count is : " + evenCount);
            System.out.println("Total Odd Count is : " + oddCount);
        }
        else{
            System.out.println("Please enter a number greater than 0");
        }
    }
}