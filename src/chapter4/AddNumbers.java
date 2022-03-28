package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String args[]){
        /*
         * DO WHILE LOOP:
         * Write a program that allows a user to enter two numbers,
         * and then sums up the two numbers. The user should be able to
         * repeat this action until they indicate they are done.
         */
        Scanner scanner = new Scanner(System.in);
        boolean again ;
        do {
            System.out.println("Enter First Number");
            int first_num = scanner.nextInt();
            System.out.println("Enter First Number");
            int second_num = scanner.nextInt();

            double sum = first_num+second_num;
            System.out.println("Sum is : " + sum);
            System.out.println("Do you want to add 2 numbers again? Enter true or false");
            again = scanner.nextBoolean();
        }
        while(again);

        scanner.close();

        }

}
