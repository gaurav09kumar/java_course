package chapter9;

public class InheritanceTester {
    public static void main(String args[]){

        Mother mother = new Mother();
        mother.setName("Jinny");

        System.out.println(mother.getName() + " is a " + mother.getGender());
        Employee employee = new Employee();

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square");
    }
}
