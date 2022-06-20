//Program to demonstrate Interfaces
interface A{
    int a=10;
    int b=20;
    
    public int m1(int a, int b);
    public int m2(int a,int b);
}
interface B{
    int a=30;
    int b=5;
    
    public int m3(int a, int b);
    public int m4(int a,int b);
}

public class Program36 implements A,B {
    public int m1(int a, int b){
        return (a+b);
    }
    public int m2(int a, int b){
        return (a-b);
    }
    public int m3(int a, int b){
        return (a*b);
    }
    public int m4(int a, int b){
        return (a/b);
    }
    public static void main(String args[]){
        A obj = new Program36();
        System.out.println(obj.m1(obj.a,obj.b));
        System.out.println(obj.m2(obj.a,obj.b));
        
        B obj2 = new Program36();
        System.out.println(obj2.m3(obj2.a,obj2.b));
        System.out.println(obj2.m4(obj2.a,obj2.b));
    }
}