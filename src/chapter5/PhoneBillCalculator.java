    package chapter5;

    import java.util.Scanner;

    public class PhoneBillCalculator {
        static double baseCost ;
        static double overageMinutes ;
        static double chargePerMinute = 0.25;
        static double tax_rate = 15 ;
        public static void main (String arg[]){
            System.out.println("Enter base cost of the plan:");
            Scanner scanner = new Scanner(System.in);
            baseCost = scanner.nextDouble();
            System.out.println("Enter overage minutes:");
            overageMinutes = scanner.nextDouble();
            double overageFees = overageFees(overageMinutes);
            double tax = tax(baseCost, overageFees);
            double total = finalTotal(baseCost,overageFees,tax);
            System.out.println("Phone Bill Statement");
            System.out.println("Plan : $"+ baseCost);
            System.out.println("Overage : $"+ overageFees);
            System.out.println("Tax : $"+ tax);
            System.out.println("Total : $"+ total);

        }

        public static double overageFees(double overageMinutes){
            double overageFees = overageMinutes*chargePerMinute;
            return overageFees;

        }
        public static double tax(double baseCost, double overageFees){
            double tax = (((baseCost+overageFees)*tax_rate)/100) ;
            return tax ;
        }
        public static double finalTotal(double baseCost, double overageFees, double tax){
            double finalTotal = baseCost + overageFees + tax;
            return finalTotal;
        }
    }
