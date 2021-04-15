package sample;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle circ = new Circle(4);
    double pi = 3.14;
    double perTest = 8 * 3.14;
    double areaTest = 16 * 3.14;


    @Test
    void getPerimeter() {
        double perimeter = circ.getPerimeter();
        assertEquals(perimeter, perTest, 0);
    }

    @Test
    void getArea() {
        double area = circ.getArea();
        assertEquals(area, areaTest, 0);
    }
}