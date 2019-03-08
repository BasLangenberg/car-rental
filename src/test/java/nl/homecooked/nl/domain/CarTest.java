package nl.homecooked.nl.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

    private Car car;

    @BeforeEach
    void setup(){
        car = new Car();
    }

    @Test
    void CarClass_DoesExist(){
        assert this.car instanceof Car;
    }

    @Test
    void CarClass_CanSetLicensePlate(){
        car.setLicensePlate("xx-xxx-xx");
    }

    @Test
    void CarClass_CanGetLicensePlate(){
        car.setLicensePlate("xx-xxx-xx");
        assert car.getLicensePlate().equals("xx-xxx-xx");
    }

    @Test
    void CarClass_GetMultipleLicensePlates(){
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setLicensePlate("xx-xxx-xx");
        car2.setLicensePlate("yy-yyy-yy");

        assert car1.getLicensePlate().equals("xx-xxx-xx");
        assert car2.getLicensePlate().equals("yy-yyy-yy");
    }
}
