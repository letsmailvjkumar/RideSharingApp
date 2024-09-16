public class Driver extends User {

    private Vehicle vehicle;
    private boolean isAvailable;

    public Driver(String userId, String name, String location, Vehicle vehicle) {
        super(userId, name, location);
        this.vehicle = vehicle;
        this.isAvailable = true;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailability(boolean available) {
        this.isAvailable = available;
    }

    public void acceptRide(Ride ride) {
        if (isAvailable) {
            System.out.println("Driver " + getName() + " has accepted the ride.");
            setAvailability(false);
            ride.setDriver(this);
            ride.startRide();
        } else{
            System.out.println("Driver is not available.");
        }
    }
}
