public class Ride {
    private Passenger passenger;
    private Driver driver;
    private String startLocation;
    private String destination;
    private String status;
    private double distance;

    public Ride(Passenger passenger, String destination) {
        this.passenger = passenger;
        this.startLocation = passenger.getLocation();
        this.destination = destination;
        this.status = "Pending";
        this.distance = calculateDistance(startLocation, destination);  // Example: Calculate distance between locations
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistance() {
        return distance;
    }

    public void startRide() {
        this.status = "Ongoing";
        System.out.println("Ride has started.");
    }

    public void completeRide() {
        this.status = "Completed";
        double fare = driver.getVehicle().calculateFare(distance);
        System.out.println("Ride completed. Fare: $" + fare);
        driver.setAvailability(true); // Driver becomes available after ride completion
    }

    private double calculateDistance(String start, String end) {
        // For simplicity, this method returns a mock distance
        return 10.0;  // Example: assume all rides are 10 km
    }

}
