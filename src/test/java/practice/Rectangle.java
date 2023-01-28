package practice;

public class Rectangle {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void area() {
        System.out.println("Area of Rectangle is: " + (width * height));
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle is: " + ((2 * width) +
                (2 * height)));
    }
}
