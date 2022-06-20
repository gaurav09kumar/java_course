//Program to demonstrate Single Inheritance 
class A{
    int a;
    int b;
    
    int m1(){
        return a+b;
    }
    
    int m2(){
        return a-b;
    }
}

class B extends A {
    
    int c;
    int d;
    
    int m3(){
        return c*d;
    }
    
    int m4(){
        return c/d;
    }
}

public class Program32 {
    public static void main(String args[]){
        B obj = new B();
        obj.a=10;
        obj.b=20;
        System.out.println("Add : " + obj.m1());
        System.out.println("Sub : " + obj.m2());
        obj.c=30;
        obj.d=50;
        System.out.println("Mul : " + obj.m3());
        System.out.println("Divide : " + obj.m4());
    }
}