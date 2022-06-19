public class Program31{
    //Program to demonstrate Static and methods 
    static int a = 10;
    static int b = 15;
    
    static int sum(){
        return a+b;
    }

    public static void main(String args[]){
        //we can access static members & methods without creating object of class
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
        System.out.println("Sum is : " + sum());
    }
}