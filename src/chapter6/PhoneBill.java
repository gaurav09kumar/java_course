package chapter6;

public class PhoneBill {
    //Fields
    private int id;
    private double baseCost;
    private double numberOfAllocatedMinutes;
    private double numberOfMinutesUsed;

    //Constructors
    //Default Constructors
    PhoneBill(){
        id = 0;
        baseCost = 79.99;
        numberOfAllocatedMinutes = 800;
        numberOfMinutesUsed = 800;
    }
    //Constructor with single parameter
    PhoneBill(int id){
        this.id = id;
        baseCost = 79.99;
        numberOfAllocatedMinutes = 800;
        numberOfMinutesUsed = 800;
    }
    //Constructor with multiple parameters
    PhoneBill(int id, double baseCost, double numberOfAllocatedMinutes, double numberOfMinutesUsed){
        this.id = id;
        setBaseCost(baseCost);
        setNumberOfAllocatedMinutes(numberOfAllocatedMinutes);
        setNumberOfMinutesUsed(numberOfMinutesUsed);
    }

    //Public get & Set Methods
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBaseCost(){
        return this.baseCost;
    }
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }
    public double getNumberOfAllocatedMinutes(){
        return this.numberOfAllocatedMinutes;
    }
    public void setNumberOfAllocatedMinutes(double numberOfAllocatedMinutes){
        this.numberOfAllocatedMinutes = numberOfAllocatedMinutes;
    }
    public double getNumberOfMinutesUsed(){
        return this.numberOfMinutesUsed;
    }
    public void setNumberOfMinutesUsed(double numberOfMinutesUsed){
        this.numberOfMinutesUsed = numberOfMinutesUsed;
    }
    public double calculateOverage(){
        if(numberOfMinutesUsed<=numberOfAllocatedMinutes){
            return 0;
        }
        double overageRate = 0.25;
        double overageMinutes = numberOfMinutesUsed-numberOfAllocatedMinutes;
        return overageRate*overageMinutes;
    }
    public double Tax(){
        double tax_rate = 0.15;
        double tax = ((baseCost+calculateOverage())*tax_rate) ;
        return tax ;
    }
    public double finalTotal(){
        return (baseCost + calculateOverage() + Tax());
    }
    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", Tax()));
        System.out.println("Total: $"
                + String.format("%.2f", finalTotal()));
    }

}
