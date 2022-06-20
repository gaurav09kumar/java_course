//Program to demonstrate Multiple Inheritance
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

class C extends B {
    int e;
    int f;
    
    int m5(){
        return e%f;
    }
}

public class Program33 {
    public static void main(String args[]){
        C obj = new C();
        obj.a=10;
        obj.b=20;
        System.out.println("Add : " + obj.m1());
        System.out.println("Sub : " + obj.m2());
        obj.c=30;
        obj.d=50;
        System.out.println("Mul : " + obj.m3());
        System.out.println("Divide : " + obj.m4());
        obj.e=10;
        obj.f=3;
        System.out.println("Modulo : " + obj.m5());
        
    }
}