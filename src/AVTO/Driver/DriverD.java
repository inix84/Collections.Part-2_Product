package AVTO.Driver;
import AVTO.Transport.Bus;
import AVTO.Driver.Driver;

public class DriverD extends Driver<Bus> {
    public DriverD(String fullName, int drivingExperience, Bus bus) {
        super(fullName, "D", drivingExperience, bus);
    }
}