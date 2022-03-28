package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String arg[]){
        System.out.println("Enter the season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        System.out.println("Enter an adjective");
        String adjective = scanner.nextLine();

        System.out.println("Enter minimum number of coffee you drink");
        int num = scanner.nextInt();

        scanner.close();

        System.out.println("On a " + adjective + " " +season + " day,I drink a minimum of " + num + " cups of coffee.");

    }
}
