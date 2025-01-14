package objects;

public class Rectangle {

    private double length;
    private double width;
    private int sides = 4;

    // needs to be the same name as the class
    // constructor sets up the initial state before you start using that object
    // constructor needs to be after the fields and before the methods by convention
    // constructor is not a method
    // default constructor does not take any arguments
    // even if you don't explicitly define a constructor, it's still there, but you can't see it
    // static classes do not have a default constructor
    // this is a default constructor
    public Rectangle() {
        setLength(0);
        setWidth(0);
        // you can also set the value directly, but it's not recommended
        this.length = 0;
        this.width = 0;
    }

    // all-args constructor. Passing all fields, except sides because this is a rectangle already.
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getSides() {
        return sides;
    }
}
