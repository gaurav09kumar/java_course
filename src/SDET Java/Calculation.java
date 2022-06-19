public class Calculation{
    //Program 30
    //Program to demonstrate Method Overloading
    int sum(int x, int y){
        return (x+y);
    }
    int sum(int x, int y, int z){
        return (x+y+z);
    }
    
    double sum(double x, double y){
        return (x+y);
    }
    
    double sum(double x, double y, double z){
        return (x+y+z);
    }

    public static void main(String args[]){
        Calculation cal = new Calculation();
        System.out.println(cal.sum(5,10));
        System.out.println(cal.sum(5,10,10));
        System.out.println(cal.sum(5.25,10.25));
        System.out.println(cal.sum(5.10,10.15,10.15));
    }
}