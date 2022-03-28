package chapter6;

public class PhoneBillCalculator {
    public static void main(String args[]){
        PhoneBill phoneBill = new PhoneBill(123456);
        phoneBill.setNumberOfMinutesUsed(1000);
        phoneBill.printItemizedBill();
    }

}
