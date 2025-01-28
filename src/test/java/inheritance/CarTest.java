package inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car1;
    Car car2;

    @BeforeEach
    void setUp() {
        car1 = new Car("Honda");
        car2 = new Car();
    }

    @Test
    void displayInfo() {
        String message1 = "Info for this car:\nBrand: Honda";
        assertEquals(message1, car1.displayInfo());
        String message2 = "Info for this car:\nBrand: Toyota";
        assertEquals(message2, car2.displayInfo());
    }

    @Test
    void getBrand() {
        assertEquals("Honda", car1.getBrand());
        assertEquals("Toyota", car2.getBrand());
    }

    @Test
    void setBrand() {
        car1.setBrand("Audi");
        System.out.println("HAGAR" + car1.getType());
        assertEquals("Audi", car1.getBrand());
    }

    @Test
    void getVehicleType() {
        assertEquals("SUV", car1.getType());
    }

    @Test
    void getVehicleNumberOfWheels() {
        assertEquals(4, car1.getNumberOfWheels());
    }

    @Test
    void getVehicleMaxSpeed() {
        assertEquals(100, car1.getMaxSpeed());
    }

    @Test
    void setVehicleType() {
        car1.setType("Sedan");
        assertEquals("Sedan", car1.getType());
    }

    @Test
    void setVehicleNumberOfWheels() {
        car1.setNumberOfWheels(6);
        assertEquals(6, car1.getNumberOfWheels());
    }

    @Test
    void setVehicleMaxSpeed() {
        car1.setMaxSpeed(250);
        assertEquals(250, car1.getMaxSpeed());
    }
}