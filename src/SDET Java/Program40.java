//exception handling
import java.io.*;
public class Program40 {
    public static void writeToFile() throws IOException {
        FileReader fr = new FileReader("C:\\Test.txt");
     //FileNotFound exception
     BufferedReader bfr = new BufferedReader(fr);
     System.out.println(bfr.readLine()); //IOException
    }
    public static void main(String [] args){
     try{
        writeToFile(); 
     }
     catch(Exception e){
         System.out.println("Inside Catch Block");
        e.printStackTrace();
    }
    }
}