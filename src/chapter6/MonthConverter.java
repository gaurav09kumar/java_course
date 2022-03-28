package chapter6;

import java.util.Scanner;

public class MonthConverter {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        //We can directly call getMonth() method from Month class because
        // these methods are declared as static so no need to create objects

        System.out.println(Month.getMonth(2));
        System.out.println(Month.getMonth("January"));
    }
}
