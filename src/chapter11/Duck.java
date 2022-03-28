package chapter11;

public class Duck extends Animal{
    @Override
    public void makeSound(String text){
        System.out.println("Duck Sounds : " + text);
    }
}
