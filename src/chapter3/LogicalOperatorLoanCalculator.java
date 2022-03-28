    package chapter3;

    import java.util.Scanner;

    /*
     * LOGICAL OPERATORS:
     * To qualify for a loan, a person must make at least $30,000
     * and have been working at their current job for at least 2 years.
     */
    public class LogicalOperatorLoanCalculator {

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
        if(actualSalary>=requiredSalary && actualYears>=requiredYears){
            System.out.println("Congrats, you have qualified for loan");
        }
        else{
            System.out.println("Sorry, You must have at least $"+ requiredSalary +" salary.");
        }
        }
    }
