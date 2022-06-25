//exception handling
class Program39 {
    public static void main(String [] args){
     try{
        String s = "abc";
        int i = Integer.parseInt(s);
    }
    catch(NumberFormatException e){
        System.out.println("Inside Catch block");
        e.printStackTrace();
    }   
    }
}