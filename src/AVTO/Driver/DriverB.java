package AVTO.Driver;
import AVTO.Transport.Car;
import AVTO.Driver.Driver;

public class DriverB extends Driver<Car> {
    public DriverB(String fullName, int drivingExperience, Car car) {
        super(fullName, "B", drivingExperience, car);
    }
}