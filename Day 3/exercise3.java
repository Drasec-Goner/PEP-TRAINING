// Question 3 (Method Overloading)
// Create a Shape class with an overloaded calculateArea() method. Implement the following versions of the method:

// calculateArea() with no parameters (for a square with side length 10).
// calculateArea(double side) for a square.
// calculateArea(double length, double width) for a rectangle.
// Create objects of the Shape class and call the different calculateArea()

// methods to calculate the areas of various shapes.

class Shape {
    public void calculateArea() {
        System.out.println("Area of square with side length 10: " + 10 * 10);
    }

    public void calculateArea(double side) {
        System.out.println("Area of square with side length " + side + ": " + side * side);
    }

    public void calculateArea(double length, double width) {
        System.out.println("Area of rectangle with length " + length + " and width " + width + ": " + length * width);
    }
}

public class exercise3 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.calculateArea();
        shape.calculateArea(5);
        shape.calculateArea(5, 10);
    }
}