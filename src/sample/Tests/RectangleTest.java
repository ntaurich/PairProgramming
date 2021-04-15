package sample.Tests;

import org.junit.jupiter.api.Test;
import sample.Rectangle;
import static org.junit.Assert.assertEquals;

class RectangleTest {
    private double length = 10;
    private double width = 5;
    private Rectangle rect = new Rectangle(length, width);

    @Test
    void getPerimeter() {
        double perimeter = rect.getPerimeter();
        assertEquals(perimeter, 30, 0);
    }

    @Test
    void getArea() {
        double area = rect.getArea();
        assertEquals(area, 50, 0);
    }
}