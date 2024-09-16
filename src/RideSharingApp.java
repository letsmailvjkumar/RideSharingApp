public class RideSharingApp {
    public static void main(String[] args) {
        // Create a ride-sharing system
        RideSharingSystem system = new RideSharingSystem();

        // Create some vehicles
        Vehicle car = new Car("ABC123", "Car", "C001", "Steve", 4, "Sedan");
        Vehicle bike = new Bike("XYZ789", "Bike", "B001", "Lokapal", true);

        // Register drivers
        Driver driver1 = new Driver("D001", "John", "Location A", car);
        Driver driver2 = new Driver("D002", "Jane", "Location B", bike);
        system.registerDriver(driver1);
        system.registerDriver(driver2);

        // Create a passenger
        Passenger passenger1 = new Passenger("P001", "Alice", "Location A", "Credit Card");

        // Passenger requests a ride
        passenger1.requestRide(system, "Location C");
    }
}