//exception handling
public class Program37 {
    public static void main(String [] args){
     try{
        int i = 10;
        i = i/0;
    }
    catch(ArithmeticException e){
        e.printStackTrace();
    }   
    }
}