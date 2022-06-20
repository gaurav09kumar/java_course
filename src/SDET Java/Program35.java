//Program to demonstrate Interfaces
interface A{
    int a=10;
    int b=20;
    
    public int m1(int a, int b);
    public int m2(int a,int b);
}

public class Program35 implements A {
    public int m1(int a, int b){
        return (a+b);
    }
    public int m2(int a, int b){
        return (a-b);
    }
    public static void main(String args[]){
        A obj = new Program35();
        System.out.println(obj.m1(obj.a,obj.b));
        System.out.println(obj.m2(obj.a,obj.b));
    }
}