package inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class VehicleTest {
    Vehicle vehicle;

    @BeforeEach
    void setup() {
        vehicle = new Vehicle("Motorcycle", 2, 1000);
    }

    @Test
    void displayInfo() {
        String expectedString = "Vehicle information:\n Type: Motorcycle\n Number of wheels: 2\n Max speed: 1000";
        assertEquals(expectedString, vehicle.displayInfo());
    }

    @Test
    void getNumberOfWheels() {
        assertEquals(2, vehicle.getNumberOfWheels());
    }

    @Test
    void setNumberOfWheels() {
        vehicle.setNumberOfWheels(3);
        assertEquals(3, vehicle.getNumberOfWheels());
    }

    @Test
    void getType() {
        assertEquals("Motorcycle", vehicle.getType());
    }

    @Test
    void setType() {
        vehicle.setType("Tricycle");
        assertEquals("Tricycle", vehicle.getType());
    }

    @Test
    void getMaxSpeed() {
        assertEquals(1000, vehicle.getMaxSpeed());
    }

    @Test
    void setMaxSpeed() {
        vehicle.setMaxSpeed(500);
        assertEquals(500, vehicle.getMaxSpeed());
    }
}