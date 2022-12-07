package AVTO.Transport;
import java.util.*;
public class ServiceStation {
    private Queue<Transport> transports = new ArrayDeque<>();
    private void add(Transport transport) {
        transports.offer(transport);
    }
    public void addCar (Car car){
        add(car);
    }
    public void addTruck (Truck truck){
        add(truck);
    }
    public void service () {
        if (transports != null || !transports.isEmpty()) {
            Transport transport = transports.poll();
            boolean result = transport.passDiagnostics();
            if (!result) {
                transport.repair();
            }
        }
    }
}