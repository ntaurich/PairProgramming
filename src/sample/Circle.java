package sample;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {

        return radius * 2 * 3.14;
    }

    public double getArea() {

        return Math.pow(radius, 2) * 3.14;
    }
}
