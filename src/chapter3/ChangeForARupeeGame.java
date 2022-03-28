package chapter3;

import java.util.Scanner;

public class ChangeForARupeeGame {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of 25 Paise coins you have");
        int numberOf25Paise = scanner.nextInt();
        System.out.println("Enter Number of 50 Paise coins you have");
        int numberOf50Paise = scanner.nextInt();
        scanner.close();

        int rupee_in_paise = 100;

        String message = "";
        double convertPaise = (25 * numberOf25Paise) +  (50 * numberOf50Paise);

        System.out.println(convertPaise);

        if(rupee_in_paise==convertPaise){
            message = "Oh! that equals one Rupee";
        }
        else if(convertPaise<rupee_in_paise){
            message = "You are short by" + (rupee_in_paise-convertPaise) +"Paise";
        }
        else{
            message = "You have exceeded by" + (convertPaise-rupee_in_paise) +"Paise";
        }
        System.out.println(message);
    }
}
