import java.util.Scanner;

class FactorialClass {
    public static void main(String[] args) {
        System.out.println("Enter the number whose factorial you want to calculate : \n"); 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println("The factorial of "+num+" is : "+ FactorialMethod(num));
    }
    
    public static int FactorialMethod(int num){
        if(num<0){
            return -1;
        }
        else if(num==0){
            return 1;
        }
        else{
            int result = 1;
            for(int i=1 ; i<=num ; i++){
                result = result * i;
            }
            return result;
        }
    }
}