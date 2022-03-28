    package chapter3;

    import java.awt.desktop.ScreenSleepEvent;
    import java.util.Scanner;

    /*
     * NESTED IFS:
     * To qualify for a loan, a person must make at least $30,000
     * and have been working at their current job for at least 2 years.
     */
    public class LoanCalculator {

        public static void main(String args[])
        {
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYears = 2;

        //Get what we don't
        System.out.println("Enter your Salary :");
        Scanner scanner = new Scanner(System.in);
        double actualSalary = scanner.nextDouble();
        System.out.println("Enter number of years with current employer :");
        int actualYears = scanner.nextInt();

        //Make decision
        if(actualSalary>=requiredSalary){
            if(actualYears>=requiredYears){
                System.out.println("Congrats, you have qualified for loan");
            }
            else{
                System.out.println("Sorry, You must have worked at current job at least "+ requiredYears +" years.");
            }
        }
        else{
            System.out.println("Sorry, You must have at least $"+ requiredSalary +" salary.");
        }
        }
    }
