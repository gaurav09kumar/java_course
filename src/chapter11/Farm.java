package chapter11;

public class Farm {
    public static void main(String [] args){
        Duck duck = new Duck();
        duck.makeSound("Quack Quack");
        duck.eat();

        Pig pig = new Pig();
        pig.makeSound("Trrr");
        pig.eat();
    }
}
