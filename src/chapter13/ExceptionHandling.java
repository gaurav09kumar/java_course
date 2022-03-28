package chapter13;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String args[]){
        //createNewFile();
        //numbersExceptionHandling();
        divideByZero();
    }
    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }
        catch (IOException excep){
            System.out.println("Directory does not exist");
            excep.printStackTrace();
        }
        catch (Exception excep){
            System.out.println("Directory does not exist");
            excep.printStackTrace();
        }
    }
    public static void createNewFileRethrow() throws IOException{
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }
    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(file);
            while (fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }
        //Pipe Symbol
        catch (FileNotFoundException | InputMismatchException excep){
            excep.printStackTrace();
        }
        catch (Exception excep){
            excep.printStackTrace();
        }
        finally {
            fileReader.close();
            System.out.println("inside Finally block");
        }

    }

    public static void divideByZero(){
        try{
            int c = 30 / 0;
        }
        catch (ArithmeticException excep){
            System.out.println("Dividing by zero is not permitted");
        }
        finally {
            System.out.println("Divison is Fun");
        }
    }
}
