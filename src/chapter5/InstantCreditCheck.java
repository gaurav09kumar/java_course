    package chapter5;

    import java.util.Scanner;

    /*
     * VARIABLE SCOPE
     * Write an 'instant credit check' program that approves
     * anyone who makes more than $25,000 and has a credit score
     * of 700 or better. Reject all others.
     */
    public class InstantCreditCheck {
        //Initialize what we know
        static int requiredSalary = 25000;
        static int requiredCreditScore = 700;
        static Scanner scanner = new Scanner(System.in);

        public static void main(String args[]){
            //Get what we don't know
            double currentSalary = getSalary();
            int currentCreditScore = getCreditScore();
            scanner.close();

            //Check if the user is qualified
            boolean message = isUserQualified(currentSalary , currentCreditScore);
            //Notify the user
            System.out.println(message);
        }
        public static double getSalary(){
            System.out.println("Enter your current Salary :");
            double currentSalary = scanner.nextDouble();
            return currentSalary;
        }
        public static int getCreditScore(){
            System.out.println("Enter your current Credit score :");
            int currentCreditScore = scanner.nextInt();
            return currentCreditScore;
        }

        public static boolean isUserQualified(double currentSalary, int currentCreditScore){
            boolean creditCheck = false;
            if(currentCreditScore>=requiredCreditScore && currentSalary>requiredSalary){
                creditCheck = true;
            }
            return creditCheck;
        }
    }
