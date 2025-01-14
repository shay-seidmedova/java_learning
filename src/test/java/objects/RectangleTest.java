package objects;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class RectangleTest {

    Rectangle rectangle = new Rectangle();

    @BeforeEach
    void setUp() {
        rectangle.setLength(10);
        rectangle.setWidth(20);
    }

    @Test
    void calculatePerimeterTest(){
        double expectedPerimeter = 60;
        Assertions.assertEquals(expectedPerimeter, rectangle.calculatePerimeter());
    }

    @Test
    void calculateAreaTest(){
        double expectedArea = 200;
        Assertions.assertEquals(expectedArea, rectangle.calculateArea());
    }

    @Test
    void getLengthTest() {
        Assertions.assertEquals(10, rectangle.getLength());
    }

    @Test
    void getWidthTest() {
        Assertions.assertEquals(20, rectangle.getWidth());
    }

    @Test
    void getSidesTest() {
        Assertions.assertEquals(4, rectangle.getSides());
    }

    @Test
    void setLengthTest() {
        rectangle.setLength(25);
        Assertions.assertEquals(25, rectangle.getLength());
        Assertions.assertEquals(500, rectangle.calculateArea(), "Area should update correctly after changing length.");
    }

    @Test
    void setWidthTest() {
        rectangle.setWidth(30);
        Assertions.assertEquals(30, rectangle.getWidth());
        Assertions.assertEquals(300, rectangle.calculateArea());
    }
}