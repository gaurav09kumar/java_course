package chapter4;

import java.util.Scanner;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */
public class Cashier {
    public  static void main (String [] arg){
        //Get the number of items to scan
        System.out.println("Enter the number of items you would you like to scan:");
        Scanner scanner = new Scanner(System.in);
        int items = scanner.nextInt();

        double total = 0;

        for(int i=1;i<=items;i++){
            System.out.println("Enter the item "+ i + " details");
            double value = scanner.nextDouble();
            total = total + value;
        }
        System.out.println("The total of items is : "+ total);
            }


}
