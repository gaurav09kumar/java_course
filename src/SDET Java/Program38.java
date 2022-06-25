//exception handling
public class Program38 {
    public static void main(String [] args){
     try{
        int a[] = null;
        System.out.println(a.length);
    }
    catch(NullPointerException e){
        System.out.println("Inside Catch block");
        e.printStackTrace();
    }   
    }
}