package chapter4;

import java.util.Scanner;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter 'A'.
 */
public class LetterSearch {
    public static void main(String args[]){
        System.out.println("Enter the 1 st string : ");
        Scanner scanner = new Scanner(System.in);
        String statement = scanner.next();

        boolean LetterFound = false;
        if(statement.contains("A") || statement.contains("a") ){
            LetterFound = true;
        }

        System.out.println(LetterFound);

        boolean LetterFound2 = false;
        System.out.println("Enter the 1 st string : ");
        String statement2 = scanner.next();
        scanner.close();
        //2nd Method
        for(int i =0 ; i < statement2.length() ; i++){
            char currentLetter = statement2.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                LetterFound2 = true;
                break;
            }
        }
        System.out.println(LetterFound2);
    }

}
