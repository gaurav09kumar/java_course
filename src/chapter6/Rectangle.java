package chapter6;

//blue print of a Rectangle Object
public class Rectangle {

    //Fields
    private double length;
    private double width;

    //Default Constructor
    //Purpose of Constructor : To initialize an object when it is created
    public Rectangle(){
        length = 0;
        width = 0;
    }
    //Constructor with parameters
    public Rectangle(double length, double width){
        this.length = length; //can be set this way or
        setWidth(width); //this way
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width  = width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
    public double calculateArea(){
        return length * width;
    }
}

/*Hiding the data of a class by making its fields private and allowing access through public methods
is known as Encapsulation
There is no limit on the maximum number of constructors allowed within a class
 */
