package chapter4;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */

import jdk.jshell.spi.ExecutionControl;

import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class AverageTestScores {
    public static void main (String [] args){
        //Initialize what we know
        int numberOfStudents = 3;
        int numberOfTests = 4;

        //Process all students
        for (int i=0; i<numberOfStudents ; i++){
            double total = 0;
            for(int j =0 ;j<numberOfTests;j++){
                System.out.println("Enter the #" + (i+1) + " Student score for test: " + (j+1));
                Scanner scanner = new Scanner(System.in);
                double score = scanner.nextDouble();
                total = total + score;

            }
            double averageMarks = total/numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + averageMarks);
        }
    }
}
