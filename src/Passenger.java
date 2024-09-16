public class Passenger extends User {
    private String paymentMethod;

    public Passenger(String userId, String name, String location, String paymentMethod) {
        super(userId, name, location);
        this.paymentMethod = paymentMethod;
    }

    // The passenger specifies the destination while requesting a ride
    public void requestRide(RideSharingSystem system, String destination) {
        Ride ride = new Ride(this, destination);  // The destination is passed here
        system.matchPassengerWithDriver(ride);
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
