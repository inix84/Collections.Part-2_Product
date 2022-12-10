package AVTO.Driver;
import AVTO.Transport.Truck;
import AVTO.Driver.Driver;

public class DriverC extends Driver<Truck> {
    public DriverC(String fullName, int drivingExperience, Truck truck) {
        super(fullName, "C", drivingExperience, truck);
    }
}