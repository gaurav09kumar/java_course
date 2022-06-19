public class Calculator{
    //Program 28
    //Program to demonstrate Constructor
    int Sub1, Sub2, Sub3;
    Calculator(int s1, int s2, int s3){
        this.Sub1 = s1;
        this.Sub2 = s2;
        this.Sub3 = s3;
    }
    int sum(){
        return (Sub1 + Sub2 + Sub3) ;
    }
    
    public static void main(String args[]){
        Calculator cal = new Calculator(15,10,30);
        System.out.println(cal.sum());
    }
}