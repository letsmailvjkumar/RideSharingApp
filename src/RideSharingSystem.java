import java.util.ArrayList;
import java.util.List;

public class RideSharingSystem {
    private List<Driver> drivers;

    public RideSharingSystem() {
        this.drivers = new ArrayList<>();
    }

    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    public void matchPassengerWithDriver(Ride ride) {
        for (Driver driver : drivers) {
            if (driver.isAvailable()) {
                driver.acceptRide(ride);
                return;
            }
        }
        System.out.println("No drivers available at the moment.");
    }

}
