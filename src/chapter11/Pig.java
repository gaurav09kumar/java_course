package chapter11;

public class Pig extends Animal{
    @Override
    public void makeSound(String text){
        System.out.println("Pig : Sound " + text);
    }
}
