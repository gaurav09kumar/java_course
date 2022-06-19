public class Sum{
    //Program 29
    //Program to demonstrate Constructor
    int a, b;
    double c, d;
    Sum(int a, int b){
        this.a = a;
        this.b = b;
    }
    Sum(double c, double d){
        this.c = c;
        this.d = d;
    }
    
    double sum(){
        return (a + b + c + d) ;
    }
    
    public static void main(String args[]){
        Sum sum = new Sum(10,20);
        Sum sum2 = new Sum(30.50,20.30);
        System.out.println(sum.sum());
        System.out.println(sum2.sum());
    }
}